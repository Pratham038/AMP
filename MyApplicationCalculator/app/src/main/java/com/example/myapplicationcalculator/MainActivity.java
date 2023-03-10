package com.example.myapplicationcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button b1;
    TextView tv1;
    int n1,n2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);
        tv1 = (TextView) findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1=Integer.parseInt(s1);
                    n2=Integer.parseInt(s2);
                    int sum = n1 + n2 ;
                    tv1.setText("Addition is " + sum);
                }catch (NumberFormatException e){

                }
            }
        });

    }
}