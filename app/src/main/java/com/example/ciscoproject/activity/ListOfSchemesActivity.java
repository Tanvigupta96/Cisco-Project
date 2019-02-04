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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ciscoproject.R;
import com.example.ciscoproject.adapter.ListOfSchemesAdapter;
import com.example.ciscoproject.model.Scheme;
import com.example.ciscoproject.model.SchemeCategory;
import com.example.ciscoproject.repository.SchemeRepository;

import java.util.ArrayList;

public class ListOfSchemesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Intent intent;
    private SchemeCategory schemeCategory;
    private Toolbar toolbar;
    private RecyclerView listrecycleview;
    private ArrayList<Scheme> schemes=new ArrayList<>();
    private ListOfSchemesAdapter adapter;
    private Spinner spinner1,spinner2,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_schemes);

        intent=getIntent();

        schemeCategory=intent.getParcelableExtra("category");
        toolbar=findViewById(R.id.toolbar);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        spinner3=findViewById(R.id.spinner3);
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


        String[] genderarray=new String[]{
                "ALL", "MALE","FEMALE"

        };


        String[] residenttypearray=new String[]{
                "ALL", "RURAL","URBAN","SEMI-URBAN"

        };


        String[] incomearray=new String[]{
                "ALL", "ZERO","LOW","HIGH","MEDIUM"

        };

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,genderarray);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,residenttypearray);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,incomearray);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);






        adapter=new ListOfSchemesAdapter(getApplicationContext(),schemes);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        listrecycleview.setLayoutManager(linearLayoutManager);
        listrecycleview.setItemAnimator(new DefaultItemAnimator());
        schemes.clear();
        schemes.addAll(schemeCategory.getSchemes());
        adapter.notifyDataSetChanged();
        listrecycleview.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(view.getId()==R.id.spinner1){
            String selectedItem= parent.getItemAtPosition(position).toString();
            if(selectedItem.equals("ALL")){
                schemes.clear();
                schemes.addAll(schemeCategory.getSchemes());
                adapter.notifyDataSetChanged();

            }
            else if(selectedItem.equals("MALE")){



            }
            else if(selectedItem.equals("FEMALE")){

            }


        }
        else if(view.getId()==R.id.spinner2){
            String selectedItem= parent.getItemAtPosition(position).toString();
            if(selectedItem.equals("ALL")){
                schemes.clear();
                schemes.addAll(schemeCategory.getSchemes());
                adapter.notifyDataSetChanged();

            }
            else if(selectedItem.equals("URBAN")){

            }
            else if(selectedItem.equals("RURAL")){

            }
            else if(selectedItem.equals("SEMI-URBAN")){

            }

        }
        else if(view.getId()==R.id.spinner3){
            String selectedItem= parent.getItemAtPosition(position).toString();
            if(selectedItem.equals("ALL")){
                schemes.clear();
                schemes.addAll(schemeCategory.getSchemes());
                adapter.notifyDataSetChanged();

            }
            else if(selectedItem.equals("ZERO")){

            }
            else if(selectedItem.equals("LOW")){

            }
            else if(selectedItem.equals("HIGH")){

            }
            else if(selectedItem.equals("MEDIUM")){

            }


        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
