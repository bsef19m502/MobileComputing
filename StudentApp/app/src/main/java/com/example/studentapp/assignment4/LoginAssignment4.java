package com.example.studentapp.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.studentapp.Assignment2.Login;
import com.example.studentapp.Assignment3.SoftwareEngineering;
import com.example.studentapp.R;
import com.example.studentapp.lab4.StudentView;

public class LoginAssignment4 extends AppCompatActivity {
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_assignment4);

        signin=findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginAssignment4.this, Base.class));

            }
        });


    }
}