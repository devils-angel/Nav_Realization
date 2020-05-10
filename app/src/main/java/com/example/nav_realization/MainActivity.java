package com.example.nav_realization;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TextView textview = (TextView)findViewById(R.id.textView7);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, rose.class);
                startActivity(intent);
            }
        });

        TextView textview1 = (TextView)findViewById(R.id.textView2);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lily.class);
                startActivity(intent);
            }
        });


        TextView textview2 = (TextView)findViewById(R.id.textView3);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lotus.class);
                startActivity(intent);
            }
        });


        TextView textview3 = (TextView)findViewById(R.id.textView4);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, poppy.class);
                startActivity(intent);
            }
        });


        TextView textview4 = (TextView)findViewById(R.id.textView5);
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lavender.class);
                startActivity(intent);
            }
        });

    }
}
