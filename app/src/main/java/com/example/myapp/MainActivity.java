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
        TextView subjectInfoText=findViewById(R.id.subject_info);
        subjectInfoText.setText("I just said \"version control\". Now since you're in this course, you might already know a bit about version control. But if you don't, a handy trick I've learned is to try reading the words in reverse - so \"version control\" would become \"control version\"! So a Version Control System is just software that helps you control (or manage) the different versions...of something (typically source code)");


    }
}
