package com.example.android.takehomeassignment06_meghanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double orginalBill;
    double taxPercentage;
    double tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcTip(View view){
        EditText billInput = (EditText) findViewById(R.id.bill);
        String bill = (billInput.getText()).toString();
        orginalBill = Double.parseDouble(bill);
        EditText taxInput = (EditText) findViewById(R.id.tax);
        String tax = (taxInput.getText()).toString();
        taxPercentage = Double.parseDouble(tax);
        EditText tipInput = (EditText) findViewById(R.id.percent);
        String tip = (tipInput.getText()).toString();
        tipPercentage = Double.parseDouble(tip);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Bill", orginalBill);
        intent.putExtra("Tax", taxPercentage);
        intent.putExtra("Percent", tipPercentage);
        startActivity(intent);
    }
}
