package com.example.raushan.propertycalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
public class Rental_yiel extends Fragment {
    View myView;
    TextView tv_1,tv_2;
    EditText e1,e2,e3;
    Button b1,b2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.rental_yield, container, false);
        e1=(EditText) myView.findViewById(R.id.ren_inc);
        e2=(EditText) myView.findViewById(R.id.ren_ovrl);
        e3=(EditText) myView.findViewById(R.id.ren_pur);
        tv_1=(TextView) myView.findViewById(R.id.tv4);
        tv_2=(TextView) myView.findViewById(R.id.tv5);
        b1=(Button) myView.findViewById(R.id.ren_cal);
        b2=(Button) myView.findViewById(R.id.ren_reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ann=Double.parseDouble(e1.getText().toString());
                double over=Double.parseDouble(e2.getText().toString());
                double pp=Double.parseDouble(e3.getText().toString());
                double gross=(ann/pp)*100;
                double net=((ann-over)/pp)*100;
                String ans1=Double.toString(gross);
                String ans2=Double.toString(net);
                tv_1.setText(""+ans1+" %");
                tv_2.setText(""+ans2+" %");
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                tv_1.setText("");
                tv_2.setText("");
                e1.requestFocus();
            }
        });
        return myView;
    }
}
