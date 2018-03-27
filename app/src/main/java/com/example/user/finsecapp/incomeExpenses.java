package com.example.user.finsecapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class incomeExpenses extends AppCompatActivity {

    ImageView dat,calc;
    EditText date;
    Spinner accname;
    Button inc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_expenses);
        dat=(ImageButton)findViewById(R.id.image);
        date=(EditText)findViewById(R.id.editText5);
        dat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int mYear=c.get(Calendar.YEAR);
                int mMonth=c.get(Calendar.MONTH);
                int mDay=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dpd=new DatePickerDialog(incomeExpenses.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        date.setText(day+"."+(month+1)+"."+year);
                    }
                },mYear,mMonth,mDay);
                dpd.show();
            }
        });
        accname=(Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adp=ArrayAdapter.createFromResource(this,R.array.accountName,android.R.layout.simple_spinner_item);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        accname.setAdapter(adp);
        accname.setSelection(0,false);
        accname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        inc=(Button)findViewById(R.id.button2);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(incomeExpenses.this, "Amount has been added to your account", Toast.LENGTH_LONG).show();
            }
        });
    }
}
