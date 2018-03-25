package com.example.user.finsecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class account extends AppCompatActivity {

    Button add;
    Spinner cur;
    String currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        add = (Button) findViewById(R.id.button);
        cur = (Spinner) findViewById(R.id.spinner);
        //cur.setOnItemSelectedListener(this,0);
        ArrayAdapter<CharSequence> ad = ArrayAdapter.createFromResource(this, R.array.CurrencyName, android.R.layout.simple_spinner_item);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cur.setAdapter(ad);
        cur.setSelection(0, false);
        cur.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                currency = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
