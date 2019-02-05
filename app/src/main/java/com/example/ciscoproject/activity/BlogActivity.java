package com.example.ciscoproject.activity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ciscoproject.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.database.SnapshotParser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;

public class BlogActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference mDatabase;
    private FirebaseDatabase database;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Query query;
    FirebaseRecyclerAdapter FBRA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        //mDatabase = FirebaseDatabase.getInstance().getReference().child("image");
        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (mAuth.getCurrentUser()==null){
                    Intent loginIntent = new Intent(BlogActivity.this, LoginAcitivity.class);
                    loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);startActivity(loginIntent);
                }

            }};


    }
    @Override//
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
        query=FirebaseDatabase.getInstance().getReference("posts");
        FirebaseRecyclerOptions<Blog> options=new FirebaseRecyclerOptions.Builder<Blog>().setQuery(query,Blog.class).build();
        FBRA = new FirebaseRecyclerAdapter<Blog, BlogViewHolder>(options) {
            @Override
            protected void onBindViewHolder(BlogViewHolder viewHolder, int position,Blog model) {

                viewHolder.setTitle(model.getTitle());
                viewHolder.setDesc(model.getDesc());
                viewHolder.setUserName(model.getUsername());

            }
            @Override
            public BlogViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items,parent,false);
                return new BlogViewHolder(view);
            }
        };
        recyclerView.setAdapter(FBRA);
        FBRA.notifyDataSetChanged();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        FBRA.stopListening();
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder{
        View mView;

        public BlogViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

        } public void setTitle(String title){
            TextView post_title = mView.findViewById(R.id.post_title_txtview);
            post_title.setText(title);
        } public void setDesc(String desc){
            TextView post_desc = mView.findViewById(R.id.post_desc_txtview);
            post_desc.setText(desc);
        } public void setUserName(String userName){
            TextView postUserName = mView.findViewById(R.id.post_user);
            postUserName.setText(userName);
        } }
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
