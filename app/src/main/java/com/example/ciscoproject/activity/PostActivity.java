package com.example.ciscoproject.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.ciscoproject.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class PostActivity extends AppCompatActivity {

    private ImageButton imageBtn; private static final int GALLERY_REQUEST_CODE = 2;
    private Uri uri = null; private EditText textTitle; private EditText textDesc;
    private Button postBtn; private StorageReference storage; private FirebaseDatabase database;
    private DatabaseReference databaseRef; private FirebaseAuth mAuth;
    private DatabaseReference mDatabaseUsers; private FirebaseUser mCurrentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        postBtn = (Button) findViewById(R.id.postBtn);
        textDesc = (EditText) findViewById(R.id.textDesc);
        textTitle = (EditText) findViewById(R.id.textTitle);
        databaseRef = FirebaseDatabase.getInstance().getReference().child("posts");

    }
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("title", textTitle);
        result.put("body", textDesc);
        return result;
    }
        // posting to Firebase
        /*postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PostActivity.this, "POSTING…", Toast.LENGTH_LONG).show();
                final String PostTitle = textTitle.getText().toString().trim();
                final String PostDesc = textDesc.getText().toString().trim();
                // do a check for empty fields
                if (!TextUtils.isEmpty(PostDesc) && !TextUtils.isEmpty(PostTitle)){
// final DatabaseReference newPost = databaseRef.push();//adding post contents to database reference
                            mDatabaseUsers.addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(DataSnapshot dataSnapshot) {
                                    databaseRef.child("title").setValue(PostTitle);
                                    databaseRef.child("desc").setValue(PostDesc);

                                    databaseRef.child("uid").setValue(mCurrentUser.getUid());
                                    databaseRef.child("username").setValue(dataSnapshot.child("name").getValue())
                                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful()){
                                                        DatabaseReference ref = databaseRef.child("posts");
                                                        ref.push();
                                                        Toast.makeText(getApplicationContext(), "Succesfully Uploaded", Toast.LENGTH_SHORT).show();
                                                        Intent intent = new Intent(PostActivity.this, BlogActivity.class);
                                                        intent.putExtra("title",PostTitle );
                                                        intent.putExtra("description",PostDesc);
                                                        startActivity(intent);


                                                    }}});}
                                @Override
                                public void onCancelled(DatabaseError databaseError) {
                                } }); } }});  }*/
    }