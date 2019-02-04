package com.example.ciscoproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.ListOfSchemesAdapter;
import com.example.ciscoproject.model.Scheme;

import java.util.ArrayList;

public class ListOfSchemesActivity extends AppCompatActivity {
    private Intent intent;
    private String title;
    private Toolbar toolbar;
    private RecyclerView listrecycleview;
    private ArrayList<Scheme> schemes=new ArrayList<>();
    private ListOfSchemesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_schemes);

        intent=getIntent();
        title=intent.getStringExtra("Title");
        Log.d("getting title",title);
        toolbar=findViewById(R.id.toolbar);
        listrecycleview=findViewById(R.id.listrecycleview);

        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finish();
            }
        });



        adapter=new ListOfSchemesAdapter(getApplicationContext(),schemes);





    }
}
