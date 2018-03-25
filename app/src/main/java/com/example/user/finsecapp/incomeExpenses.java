package com.example.user.finsecapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Calendar;

public class incomeExpenses extends AppCompatActivity {

    ImageView dat,calc;
    EditText date;
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

    }
}
