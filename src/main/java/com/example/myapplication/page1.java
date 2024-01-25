package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class page1 extends AppCompatActivity {

    TextView hello;
    String pangalan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);


    }
    public void Gocoverpage(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.myapplication.coverpage.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }


    public void GoPage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}