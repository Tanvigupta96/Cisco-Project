package com.example.ciscoproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.ListOfSchemesAdapter;
import com.example.ciscoproject.model.Scheme;
import com.example.ciscoproject.model.SchemeCategory;
import com.example.ciscoproject.repository.SchemeRepository;

import java.util.ArrayList;

public class ListOfSchemesActivity extends AppCompatActivity {
    private Intent intent;
    private SchemeCategory schemeCategory;
    private Toolbar toolbar;
    private RecyclerView listrecycleview;
    private ArrayList<Scheme> schemes=new ArrayList<>();
    private ListOfSchemesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_schemes);

        intent=getIntent();

        schemeCategory=intent.getParcelableExtra("category");
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listrecycleview=findViewById(R.id.listrecycleview);

        getSupportActionBar().setTitle(schemeCategory.getTitle());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        adapter=new ListOfSchemesAdapter(getApplicationContext(),schemes);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        listrecycleview.setLayoutManager(linearLayoutManager);
        listrecycleview.setItemAnimator(new DefaultItemAnimator());
        schemes.clear();
        schemes.addAll(schemeCategory.getSchemes());
        adapter.notifyDataSetChanged();
        listrecycleview.setAdapter(adapter);

    }
}
