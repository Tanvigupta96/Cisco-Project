package com.example.ciscoproject.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ciscoproject.R;
import com.example.ciscoproject.fragments.SchemeCatergoryFragment;

public class SchemesActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private SchemeCatergoryFragment schemeCatergoryFragment=new SchemeCatergoryFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setTitle("Schemes Sectors");
        fragmentTransaction.replace(R.id.container, schemeCatergoryFragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.schemes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.notification) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SchemesActivity.this);
            builder.setTitle("Get Notifications About any recent scheme!");
            builder.setIcon(R.drawable.ic_thumb_up_black_18dp);
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(SchemesActivity.this, SchemesActivity.class);
                    startActivity(intent);

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.schemes) {
            getSupportActionBar().setTitle("Schemes Sectors");
            transaction.replace(R.id.container, schemeCatergoryFragment);



        } else if (id == R.id.login) {
            Intent intent = new Intent(SchemesActivity.this, LoginAcitivity.class);
            startActivity(intent);
        } else if (id == R.id.discuss) {




        } else if (id == R.id.latest) {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri=Uri.parse("https://currentaffairs.gktoday.in/tags/government-schemes");
            intent.setData(uri);
            startActivity(intent);



        } else if (id == R.id.complaintbox){
            Intent intent=new Intent(SchemesActivity.this,SendQueryActivity.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_share) {


        }

        else if (id == R.id.nav_send) {

        }
        transaction.commit();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
