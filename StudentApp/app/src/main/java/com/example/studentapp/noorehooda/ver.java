package com.example.studentapp.noorehooda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.studentapp.R;


public class ver extends AppCompatActivity {
    TextView e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);
        e=findViewById(R.id.v);

        String email=getIntent().getStringExtra("Quran");
        e.setText(email);

    }
}