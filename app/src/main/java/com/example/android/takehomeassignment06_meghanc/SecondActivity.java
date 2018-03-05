package com.example.android.takehomeassignment06_meghanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double bill = intent.getDoubleExtra("Bill", 30.00);
        double tax = intent.getDoubleExtra("Tax", 0.0875);
        double percent = intent.getDoubleExtra("Percent", 0.1);

        double totalTax = bill * tax;
        double billNoTip = bill + totalTax;
        double tip = bill * percent;
        double totalBill = (billNoTip + tip);

        String outputBill = String.format("%.2f", bill);
        Double outputTax = tax * 100;
        Double outputTip = percent * 10;
        String outputTotal = String.format("%.2f", totalBill);

        TextView output = (TextView) findViewById(R.id.display);
        String message = "Total: " + outputBill + "\nTax: " + outputTax + "\nTip: " + outputTip + "\nGrand Total: " + outputTotal;
        output.setText(message);
    }
}
