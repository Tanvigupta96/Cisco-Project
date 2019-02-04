package com.example.ciscoproject.activity;

import android.content.Intent;
import android.media.ImageReader;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ciscoproject.R;
import com.example.ciscoproject.model.Scheme;
import com.example.ciscoproject.model.SchemeCategory;

import java.util.ArrayList;

public class SchemeDetailActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;
    private Toolbar toolbar;
    private Scheme scheme;
    private TextView schemetitle;
    private TextView schemedescription;
    private TextView residenttype;
    private ImageView schemeimage;
    private TextView incometype;
    private  TextView gendertype;
    private ImageButton documentation;
    private  ImageButton share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme_detail);

        intent=getIntent();

        scheme=intent.getParcelableExtra("scheme");
        toolbar=findViewById(R.id.toolbar);
        schemetitle=findViewById(R.id.schemetitle);
        schemeimage=findViewById(R.id.schemeimage);
        schemedescription=findViewById(R.id.schemedescription);
        residenttype=findViewById(R.id.residenttype);
        gendertype=findViewById(R.id.gendertype);
        incometype=findViewById(R.id.incometype);
        documentation=findViewById(R.id.documentation);
        share=findViewById(R.id.share);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(scheme.getTitle());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finish();
            }
        });

        schemetitle.setText(scheme.getTitle());
        schemeimage.setBackgroundResource(scheme.getUrl());
        schemedescription.setText(scheme.getDescription());
        residenttype.setText(scheme.getResidentType().name());
        gendertype.setText(scheme.getGender().name());
        incometype.setText(scheme.getIncomeType().name());
        documentation.setOnClickListener(this);
        share.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id == R.id.documentation){
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse(scheme.getDocumentationLink());
            Log.d("documentation link",scheme.getDocumentationLink());
            intent.setData(uri);
            startActivity(intent);
        }
        else if(id == R.id.share){
            ArrayList<String> data=new ArrayList<>();
            data.add(scheme.getTitle());
            data.add(scheme.getDocumentationLink());
            String data1= TextUtils.join("\n",data);
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,data1);
            startActivity(intent);


        }

    }
}
