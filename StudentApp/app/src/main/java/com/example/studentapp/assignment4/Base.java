package com.example.studentapp.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.studentapp.R;

public class Base extends AppCompatActivity {
    FrameLayout fl;
    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);


        fm=getFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.LoginFragment_container,new TeacherFragment());
        ft.commit();
//        getSupportFragmentManager().beginTransaction().replace(R.id.LoginFragment_container,new TeacherFragment()).commit();
    }
}