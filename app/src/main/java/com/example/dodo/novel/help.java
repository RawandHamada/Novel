package com.example.dodo.novel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by روند حمادة on 07/10/2017.
 */

public class help extends MainActivity {
    TextView t1;
        TextView t2;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView3);
        t2=(TextView) findViewById(R.id.textView4);
        b1=(Button)findViewById(R.id.button8);
        b2=(Button)findViewById(R.id.button9);
        t1.setText(t1.getText());
        t2.setText(t2.getText());


    }}
