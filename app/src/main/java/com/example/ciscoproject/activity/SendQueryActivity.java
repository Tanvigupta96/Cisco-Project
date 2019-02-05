package com.example.ciscoproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ciscoproject.R;
import com.example.ciscoproject.model.Mail;

public class SendQueryActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText editsub,editmsg;
    private Button send;
    private final String to = "koshimagoyal97@gmail.com";
    private final String from="govtapp123@gmail.com";
    private String sub,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_query);

        send=findViewById(R.id.send);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Email Queries");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finish();
            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editsub=findViewById(R.id.subject);
                editmsg=findViewById(R.id.message);
                sub=editsub.getText().toString();
                body=editmsg.getText().toString();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Mail sender = new Mail("govtapp123@gmail.com", "ga1234567890");
                            sender.sendMail(sub,body, from, to);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(),"message sent",Toast.LENGTH_LONG).show();
                                }
                            });

                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                        }
                    }
                }).start();

            }
        });

    }

}




