package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button s;
    TextView n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s=findViewById(R.id.sec);
        n=findViewById(R.id.name);
        s.setOnClickListener(new View.OnClickListener() {
                                 @Override
        public void onClick(View view) {
                                     Intent in=new Intent(MainActivity.this,MainActivity2.class);
                                     String name=n.getText().toString();
                                     in.putExtra("name",name);
                                     startActivity(in);


                                 }
                             }
        );
    }
}