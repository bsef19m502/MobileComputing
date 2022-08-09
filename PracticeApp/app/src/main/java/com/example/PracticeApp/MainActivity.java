package com.example.PracticeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView n,p,e,g,d;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=findViewById(R.id.n);
        p=findViewById(R.id.p);
        e=findViewById(R.id.e);
        g=findViewById(R.id.g);
        d=findViewById(R.id.d);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String phone = intent.getStringExtra("Phone");
        String gen = intent.getStringExtra("Gender");
        String dep = intent.getStringExtra("Department");



        n.setText(name);
        p.setText(email);
        e.setText(phone);
        g.setText(gen);
        d.setText(dep);

    }

    public void toast(View view) {
        //Toast.makeText(getApplicationContext(), "Data Submitted successfully", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity.this, StudentActivity.class);
        startActivity(in);

    }
}