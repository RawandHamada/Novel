package com.example.dodo.novel;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.textL);
        setSupportActionBar(toolbar);
        mTitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.app:
                Intent intent = new Intent(MainActivity.this, app.class);
                startActivity(intent);
                finish();
                return true;
            case R.id.out:
                Intent intentout = new Intent(this,MainActivity.class);
                startActivity(intentout);
                this.finish();

                return true;
            case R.id.help:
                Intent intenthelp = new Intent(MainActivity.this, help.class);
                startActivity(intenthelp);
                finish();

                return true;
            case R.id.Favorites:
                Intent intentF = new Intent(MainActivity.this, Favorites.class);
                startActivity(intentF);
                finish();


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

