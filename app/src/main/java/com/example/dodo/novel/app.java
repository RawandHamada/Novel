package com.example.dodo.novel;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by روند حمادة on 07/10/2017.
 */

public class app extends MainActivity{
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.text);
        t.setText(t.getText());
}}
