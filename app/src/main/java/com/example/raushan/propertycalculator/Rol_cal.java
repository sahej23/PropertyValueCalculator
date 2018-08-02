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

public class Rol_cal extends Fragment {
    View myView;
    EditText e1,e2;
    TextView tv;
    Button b1,b2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.rol_cal, container, false);
        e1=(EditText) myView.findViewById(R.id.roi_pur);
        e2=(EditText) myView.findViewById(R.id.roi_sel);
        tv=(TextView) myView.findViewById(R.id.tv3);
        b1=(Button) myView.findViewById(R.id.roi_cal);
        b2=(Button) myView.findViewById(R.id.roi_reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pur=Double.parseDouble(e1.getText().toString());
                double sell=Double.parseDouble(e2.getText().toString());
                double ans=0;
                ans=((sell-pur)/pur)*100;
                String a=Double.toString(ans);
                tv.setText(" "+a+"%");
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
