package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page2 extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void GoPage1(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.myapplication.page1.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage3(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page3.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}