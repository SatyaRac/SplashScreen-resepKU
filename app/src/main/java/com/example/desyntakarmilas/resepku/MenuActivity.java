package com.example.desyntakarmilas.resepku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
private Button btnGudeg;
public static final int TO_DETAIL = 100;
public static final int GO_HOME= 100;
public static final String GUDEG= "GUDEG";

Button masakan, minuman, camilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        masakan = (Button) findViewById(R.id.btn_toDetail);
        masakan.setOnClickListener(this);

        minuman = (Button) findViewById(R.id.btn_minum);
        minuman.setOnClickListener(this);

        camilan = (Button) findViewById(R.id.btn_camilan);
        camilan.setOnClickListener(this);





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnGudeg = findViewById(R.id.btn_toDetail);
        btnGudeg.setOnClickListener(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_toDetail :
                Intent toMasak = new Intent(MenuActivity.this, MasakanActivity.class);
                startActivity(toMasak);
                break;

                case R.id.btn_minum :
                    Intent toMinum = new Intent(MenuActivity.this, MinumanActivity.class);
                    startActivity(toMinum);
                    break;

                    case R.id.btn_camilan :
                        Intent toCamilan = new Intent(MenuActivity.this, CamilanActivity.class);
                        startActivity(toCamilan);
                        break;
                    }
                }
//                Intent toDetail = new Intent(MenuActivity.this, DetailActivity.class);
//                toDetail.putExtra("resep", GUDEG);
//                startActivityForResult(toDetail, TO_DETAIL );


            }






