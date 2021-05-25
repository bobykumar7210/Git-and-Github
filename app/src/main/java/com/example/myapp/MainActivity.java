package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("home");

        TextView titleText=findViewById(R.id.title);
        titleText.setText("GitHub");
        TextView subjectText=findViewById(R.id.subject);
        subjectText.setText("version controlled  and Git ");


    }
}
