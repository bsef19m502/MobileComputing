package com.example.studentapp.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.studentapp.R;

import java.util.ArrayList;

public class StudentView extends AppCompatActivity {

    RecyclerView recycleView;
    ArrayList<Student> studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_view);

        recycleView=findViewById(R.id.rv);
       studentArrayList= initStudentPrameterList();
       InitRecycleView();


    }
//    private ArrayList initStudentList(){
//        ArrayList<Student> sList = new ArrayList<Student>();
//        Student s1=new Student();
//        s1.setName("Azka");
//        Student s2=new Student();
//        s2.setName("Noreen");
//        Student s3=new Student();
//        s3.setName("Ali");
//        Student s4=new Student();
//        s4.setName("noor");
//        s1.setPhone("0312-5645678");
//        s2.setPhone("0312-4567654");
//        s3.setPhone("0312-4567564");
//        s4.setPhone("0312-4356534");
//
//
//        sList.add(s1);
//        sList.add(s2);
//        sList.add(s3);
//        sList.add(s4);
//
//        return sList;
//    }
    private ArrayList<Student> initStudentPrameterList(){
        ArrayList<Student> studentArrayList2=new ArrayList<>();
        Student s1=new Student("Azka","0333-8976547");
        Student s2=new Student("Azka","0372-8976447");
        Student s3=new Student("Azka","0313-8966547");
        Student s4=new Student("Azka","0336-8646547");

        studentArrayList2.add(s1);
        studentArrayList2.add(s2);
        studentArrayList2.add(s3);
        studentArrayList2.add(s4);

        return studentArrayList2;
    }

    public void InitRecycleView(){
        RecyclerViewAdapter rva=new RecyclerViewAdapter();
        recycleView.setAdapter(rva);
        recycleView.setLayoutManager(new GridLayoutManager(this,3));

        rva.setData(studentArrayList);

    }
}