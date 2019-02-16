package com.example.ciscoproject.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.BlogViewHolder;
import com.example.ciscoproject.adapter.CommentViewHolder;
import com.example.ciscoproject.model.Blog;
import com.example.ciscoproject.model.Comment;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.database.SnapshotParser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Query;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;

public class BlogActivity extends AppCompatActivity {

    private RecyclerView recyclerView,comment_recyclerView;
    private DatabaseReference mDatabase;
    private FirebaseUser user;
    private FirebaseAuth mAuth;
    //private FirebaseAuth.AuthStateListener mAuthListener;
    FirebaseRecyclerAdapter FBRA,FBRA_Comment;
    String cedit,ctext,cno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);
        mAuth=FirebaseAuth.getInstance();
        user = FirebaseAuth.getInstance().getCurrentUser();
                if (user==null){
                    Intent loginIntent = new Intent(BlogActivity.this, LoginAcitivity.class);
                    loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);startActivity(loginIntent);
                }
                else
                {
                    mDatabase=FirebaseDatabase.getInstance().getReference().child("posts");
                    mDatabase.keepSynced(true);
                }


    }

    private void onPostComment(final String uid,String edit,final String text,String no) {
        cedit=edit;
        ctext=text;
        cno=no;
        final DatabaseReference newPost = mDatabase.child(text).child("comment_text").push();
        mDatabase.child(text).child("comment_text").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try{
                newPost.child("edit_text").setValue(cedit);
                newPost.child("uid").setValue(user.getUid()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            mDatabase.child(ctext).child("comment").setValue(String.valueOf(Long.parseLong(cno)+1));
                            comment_fetch(ctext);
                        }
                    }
                });}
                catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void comment_fetch(String text) {

        mDatabase.child(text).child("comment_text").keepSynced(true);
        Query query=mDatabase.child(text).child("comment_text").orderByKey();
        FirebaseRecyclerOptions<Comment> options=new FirebaseRecyclerOptions.Builder<Comment>().setQuery(query, new SnapshotParser<Comment>() {
            @NonNull
            @Override
            public Comment parseSnapshot(@NonNull DataSnapshot snapshot) {
                String comment_id = snapshot.getKey();
                String comment_desc = snapshot.child("edit_text").getValue(String.class);
                return new Comment(comment_id,comment_desc);
            }
        }).build();
        FBRA_Comment= new FirebaseRecyclerAdapter<Comment,CommentViewHolder>(options) {
            @Override
            protected void onBindViewHolder(final CommentViewHolder holder, int position, final Comment model) {
                holder.setComment_id(model.getCommentId());
                holder.setComment_desc(model.getComment());
                //FBRA.notifyItemChanged(position,holder);
            }

            @NonNull
            @Override
            public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_items, parent, false);
                return new CommentViewHolder(view);
            }
        };
        FBRA_Comment.startListening();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Query query=mDatabase.orderByKey();
        FirebaseRecyclerOptions<Blog> options=new FirebaseRecyclerOptions.Builder<Blog>().setQuery(query, new SnapshotParser<Blog>() {
            @NonNull
            @Override
            public Blog parseSnapshot(@NonNull DataSnapshot snapshot) {
                String title = snapshot.child("title").getValue(String.class);
                String desc = snapshot.child("desc").getValue(String.class);
                String uid = snapshot.getKey();
                String likeno = snapshot.child("like").getValue(String.class);
                String commentno = snapshot.child("comment").getValue(String.class);
                return new Blog(title,desc,uid,likeno,commentno);
            }
        }).build();
        FBRA = new FirebaseRecyclerAdapter<Blog, BlogViewHolder>(options) {
            @Override
            protected void onBindViewHolder(final BlogViewHolder viewHolder, final int position, final Blog model) {

                viewHolder.setTitle(model.getTitle());
                viewHolder.setDesc(model.getDesc());
                viewHolder.setUserName(model.getUid());
                viewHolder.setLikeNo(model.getLikeno());
                viewHolder.setCommentNo(model.getCommentno());
                viewHolder.comment.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                viewHolder.comment.setHasFixedSize(false);
                viewHolder.comment.setAdapter(FBRA_Comment);
                //notifyItemChanged(position);
                comment_fetch(viewHolder.postUserName.getText().toString());
                viewHolder.sendComment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //notifyItemChanged(position);
                        onPostComment(viewHolder.postUserName.getText().toString(),viewHolder.editComment.getText().toString(),viewHolder.postUserName.getText().toString(),viewHolder.postCommentNo.getText().toString());
                    }
                });
                }
            @Override
            public BlogViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items,parent,false);
                final BlogViewHolder holder = new BlogViewHolder(view);
                holder.postLike.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDatabase.child(holder.postUserName.getText().toString()).child("like").setValue(String.valueOf(Long.parseLong(holder.postLikeNo.getText().toString())+1));
                    }
                });

                return holder;
            }


        };
        FBRA.startListening();
        recyclerView.setAdapter(FBRA);
    }

    @Override
    protected void onResume(){
        super.onResume();
        if(FBRA!=null){
            FBRA.startListening();
        }
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        if(FBRA!=null){
        FBRA.stopListening();}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.blog, menu);
        return true;
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_add) {
            startActivity(new Intent(BlogActivity.this, PostActivity.class));
        } else if (id == R.id.logout){
            mAuth.signOut();
            Intent logouIntent = new Intent(BlogActivity.this, LoginAcitivity.class);
            logouIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(logouIntent);
        } return super.onOptionsItemSelected(item);
    }}
