package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class coverpage extends AppCompatActivity {
    TextView hello;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverpage);

    }
    public void G(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.myapplication.MainActivity.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage1(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page1.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}