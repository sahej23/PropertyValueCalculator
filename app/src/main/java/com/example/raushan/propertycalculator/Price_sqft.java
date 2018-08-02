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

public class Price_sqft extends Fragment {
    View myView;
    EditText e1,e2;
    TextView tv;
    Button b1,b2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.price_sqft, container, false);
        e1=(EditText) myView.findViewById(R.id.price_pro);
        e2=(EditText) myView.findViewById(R.id.price_sq_sq);
        tv=(TextView) myView.findViewById(R.id.tv2);
        b1=(Button) myView.findViewById(R.id.sqft_cal);
        b2=(Button) myView.findViewById(R.id.sqft_reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double price=Double.parseDouble(e1.getText().toString());
                double size=Double.parseDouble(e2.getText().toString());
                double ans=0;
                ans=price/size;
                String a=Double.toString(ans);
                tv.setText("₹ "+a+" /sq feet");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                tv.setText("");
                e1.requestFocus();
            }
        });
        return myView;


    }
}
