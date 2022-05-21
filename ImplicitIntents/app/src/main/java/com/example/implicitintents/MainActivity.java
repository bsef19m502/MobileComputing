package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button web,dial,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=findViewById(R.id.goToWeb);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://github.com/bsef19m502/MobileComputing");
                Intent in=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(in);
            }
        });
        dial=findViewById(R.id.dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("tel:+923338236850");
                Intent in=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(in);
            }
        });
        e=findViewById(R.id.em);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Uri uri=Uri.parse("tel:+923338236850");
                Intent in=new Intent(Intent.ACTION_SEND);
                in.setData(Uri.parse("mailto:"));
                in.setType("*/*");
                in.putExtra(in.EXTRA_EMAIL,"azka.noreen6@gmail.com");
                in.putExtra(in.EXTRA_SUBJECT,"test");
                if(in.resolveActivity(getPackageManager()) != null) {
                    startActivity(in);
                }

                startActivity(in);}

        });

    }
}