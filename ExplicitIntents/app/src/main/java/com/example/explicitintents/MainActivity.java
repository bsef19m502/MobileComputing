package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s=findViewById(R.id.sec);
        s.setOnClickListener(new View.OnClickListener() {
                                 @Override
        public void onClick(View view) {
                                     Intent in=new Intent(MainActivity.this,MainActivity2.class);
                                     startActivity(in);


                                 }
                             }
        );
    }
}