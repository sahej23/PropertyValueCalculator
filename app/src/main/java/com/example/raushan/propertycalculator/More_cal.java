package com.example.raushan.propertycalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class More_cal extends Fragment{
    View myView;
    EditText e1,e2,e3;
    Button b1,b2;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.mor_cal, container, false);
        e1=(EditText) myView.findViewById(R.id.loan_amount);
        e2=(EditText) myView.findViewById(R.id.int_rate);
        e3=(EditText) myView.findViewById(R.id.loan_period);
        tv=(TextView) myView.findViewById(R.id.tv1);
        b1=(Button) myView.findViewById(R.id.mor_cal);
        b2=(Button) myView.findViewById(R.id.mor_reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount=Double.parseDouble(e1.getText().toString());
                double i=Double.parseDouble(e2.getText().toString());
                double loan=Double.parseDouble(e3.getText().toString());
                double p=0;
                double p1=0;
                double p2=0;
                double interest=i/100;
                p1=Math.pow((1+interest),loan);
                p2=Math.pow((1+interest),(loan-1));
                p=(amount*interest*p1)/p2;
                String ans=Double.toString(p);
                tv.setText("₹ "+ans+" per month");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                tv.setText("");
                e1.requestFocus();
            }
        });
        return myView;
    }
}
