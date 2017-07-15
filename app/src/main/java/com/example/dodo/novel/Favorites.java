package com.example.dodo.novel;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by روند حمادة on 07/10/2017.
 */

public class Favorites extends MainActivity {
    TextView textf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textf = (TextView) findViewById(R.id.text);
        textf.setText(textf.getText());


    }
}
