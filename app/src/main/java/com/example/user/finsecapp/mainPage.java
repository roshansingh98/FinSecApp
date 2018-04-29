package com.example.user.finsecapp;

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
import android.widget.ImageButton;

public class mainPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        android.widget.Button img1,img2,img3;
        img1=findViewById(R.id.imageButton3);
        img2=findViewById(R.id.imageButton4);
        img3=findViewById(R.id.imageButton2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),news2.class);
                startActivity(i);
            }

        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),financialtrends.class);
                startActivity(i);
            }

        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),news1.class);
                startActivity(i);
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
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_page, menu);
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
            finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_accounts) {
            Intent intent3=new Intent(getApplicationContext(),account.class);
            startActivity(intent3);
        } else if (id == R.id.nav_mutual_funds_faq) {
            Intent intent=new Intent(getApplicationContext(),mutualFundsFaq.class);
            startActivity(intent);
        } else if (id == R.id.nav_invest_online) {
            Intent intent1=new Intent(getApplicationContext(),ItemListActivity.class);
            startActivity(intent1);
        } else if (id == R.id.nav_about) {

        } else if (id==R.id.nav_converter){


        } else if(id==R.id.nav_bank_rates){
            Intent intent5=new Intent(getApplicationContext(),BankRates.class);
            startActivity(intent5);

        }else if(id==R.id.nav_fd_calculator) {
            Intent intent2=new Intent(getApplicationContext(),FD_calculator.class);
            startActivity(intent2);
        } else if (id==R.id.nav_income){
            Intent intent4=new Intent(getApplicationContext(),incomeExpenses.class);
            startActivity(intent4);
        } else if (id==R.id.nav_expenses){
            Intent intent6=new Intent(getApplicationContext(),expenses.class);
            startActivity(intent6);
        }else if (id==R.id.nav_rd_calculator){
            Intent intent7=new Intent(getApplicationContext(),rd_Calculator.class);
            startActivity(intent7);
        } else if (id==R.id.nav_income_tax_faq){
            Intent intent8=new Intent(getApplicationContext(),income_tax_faq.class);
            startActivity(intent8);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
