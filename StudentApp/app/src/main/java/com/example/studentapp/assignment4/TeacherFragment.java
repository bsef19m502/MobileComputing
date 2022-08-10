package com.example.studentapp.assignment4;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentapp.R;
import com.example.studentapp.lab4.RecyclerViewAdapter;
import com.example.studentapp.lab4.Student;

import java.util.ArrayList;

public class TeacherFragment extends Fragment {
    RecyclerView recycleView;
    ArrayList<StudentNameCourse> studentNameCourseArrayList;
    public TeacherFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_teacher, container, false);
        recycleView=view.findViewById(R.id.studentNameCourse);
        studentNameCourseArrayList= initStudentPrameterList();
        InitRecycleView();
        return view;
    }

    private ArrayList<StudentNameCourse> initStudentPrameterList() {
        ArrayList<StudentNameCourse> studentArrayList2=new ArrayList<>();
        StudentNameCourse s1=new StudentNameCourse("Azka","se");
        StudentNameCourse s2=new StudentNameCourse("Azka","ser");
        StudentNameCourse s3=new StudentNameCourse("Azka","fer");
        StudentNameCourse s4=new StudentNameCourse("Adzka","fer");
        StudentNameCourse s5=new StudentNameCourse("Azka","efe");
        StudentNameCourse s6=new StudentNameCourse("Azka","efe");
        StudentNameCourse s7=new StudentNameCourse("Azka","efe");
        StudentNameCourse s8=new StudentNameCourse("Azddka","efe");
        StudentNameCourse s9=new StudentNameCourse("Azka","efe");
        StudentNameCourse s10=new StudentNameCourse("Azka","efe");


        studentArrayList2.add(s1);
        studentArrayList2.add(s2);
        studentArrayList2.add(s3);
        studentArrayList2.add(s4);
        studentArrayList2.add(s5);
        studentArrayList2.add(s6);
        studentArrayList2.add(s7);
        studentArrayList2.add(s8);
        studentArrayList2.add(s9);
        studentArrayList2.add(s10);


        return studentArrayList2;
    }
    public void InitRecycleView(){
        FragmentRecyclerAdapter fra=new FragmentRecyclerAdapter();
        recycleView.setAdapter(fra);
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //recycleView.setLayoutManager(new GridLayoutManager(this,3));

        fra.setData(studentNameCourseArrayList);

    }
}