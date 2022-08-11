package com.example.studentapp.assignment4;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentapp.R;
import com.example.studentapp.lab4.RecyclerViewAdapter;
import com.example.studentapp.lab4.Student;

import java.util.ArrayList;

public class TeacherFragment extends Fragment {
    RecyclerView recycleView;
    ArrayList<StudentNameCourse> studentNameCourseArrayList;
    TextView test;
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
        String Email=getArguments().getString("Emai");
//        test=view.findViewById(R.id.test);
//        test.setText(Email);
        if(Email.equals(Constants.secondTeacherEmail)){
            studentNameCourseArrayList= initStudentPrameterListShakar();
        }
        else if(Email.equals(Constants.firstTeacherEmail)){
            studentNameCourseArrayList= initStudentPrameterListKashif();
        }
        else{
            studentNameCourseArrayList= initStudentPrameterListStudent();
        }
//        studentNameCourseArrayList= initStudentPrameterListShakar();
        InitRecycleView();
        return view;
    }

    private ArrayList<StudentNameCourse> initStudentPrameterListStudent() {
        ArrayList<StudentNameCourse> studentArrayList2=new ArrayList<>();
        StudentNameCourse s1=new StudentNameCourse(R.drawable.ic_subject,"Android","Computer Science");
        StudentNameCourse s2=new StudentNameCourse(R.drawable.ic_subject,"Web","Computer Science");
        StudentNameCourse s3=new StudentNameCourse(R.drawable.ic_subject,"Os","Computer Science");
        StudentNameCourse s4=new StudentNameCourse(R.drawable.ic_subject,"COAL","Computer Science");
        StudentNameCourse s5=new StudentNameCourse(R.drawable.ic_subject,"DLD","Computer Science");
        StudentNameCourse s6=new StudentNameCourse(R.drawable.ic_subject,"Vectorizing","Graphics");
        StudentNameCourse s7=new StudentNameCourse(R.drawable.ic_subject,"Painting","Graphics");
        StudentNameCourse s8=new StudentNameCourse(R.drawable.ic_subject,"Sketching","Graphics");
        StudentNameCourse s9=new StudentNameCourse(R.drawable.ic_subject,"infographing","Graphics");
        StudentNameCourse s10=new StudentNameCourse(R.drawable.ic_subject,"Crafting","Graphics");
        StudentNameCourse s11=new StudentNameCourse(R.drawable.ic_subject,"Cellology","Medical");
        StudentNameCourse s12=new StudentNameCourse(R.drawable.ic_subject,"Chemistry","Medical");
        StudentNameCourse s13=new StudentNameCourse(R.drawable.ic_subject,"Psychology","Medical");
        StudentNameCourse s14=new StudentNameCourse(R.drawable.ic_subject,"Anatomy","Medical");
        StudentNameCourse s15=new StudentNameCourse(R.drawable.ic_subject,"Biology","Medical");
        StudentNameCourse s16=new StudentNameCourse(R.drawable.ic_subject,"Cal","Math");
        StudentNameCourse s17=new StudentNameCourse(R.drawable.ic_subject,"Cal2","Math");
        StudentNameCourse s18=new StudentNameCourse(R.drawable.ic_subject,"Trignomoetry","Math");
        StudentNameCourse s19=new StudentNameCourse(R.drawable.ic_subject,"Algebra","Math");
        StudentNameCourse s20=new StudentNameCourse(R.drawable.ic_subject,"Analysis","Math");

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
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

        return studentArrayList2;
    }

    private ArrayList<StudentNameCourse> initStudentPrameterListKashif() {
        ArrayList<StudentNameCourse> studentArrayList2=new ArrayList<>();
        StudentNameCourse s1=new StudentNameCourse(R.drawable.ic_student,"Azka","Android");
        StudentNameCourse s2=new StudentNameCourse(R.drawable.ic_student,"Samra","EAD");
        StudentNameCourse s3=new StudentNameCourse(R.drawable.ic_student,"Tayyaba","SE");
        StudentNameCourse s4=new StudentNameCourse(R.drawable.ic_student,"Shakila","LA");
        StudentNameCourse s5=new StudentNameCourse(R.drawable.ic_student,"Noor","PS");
        StudentNameCourse s6=new StudentNameCourse(R.drawable.ic_student,"Ali","Web");
        StudentNameCourse s7=new StudentNameCourse(R.drawable.ic_student,"Akif","OS");
        StudentNameCourse s8=new StudentNameCourse(R.drawable.ic_student,"Arijit","LA");
        StudentNameCourse s9=new StudentNameCourse(R.drawable.ic_student,"Veer","BE");
        StudentNameCourse s10=new StudentNameCourse(R.drawable.ic_student,"Lee Min Hoo","DSA");
        StudentNameCourse s11=new StudentNameCourse(R.drawable.ic_student,"Sapna Pabhi","OOP");
        StudentNameCourse s12=new StudentNameCourse(R.drawable.ic_student,"Komal","PF");
        StudentNameCourse s13=new StudentNameCourse(R.drawable.ic_student,"Saleha","BW");
        StudentNameCourse s14=new StudentNameCourse(R.drawable.ic_student,"Farhan","TW");
        StudentNameCourse s15=new StudentNameCourse(R.drawable.ic_student,"Zain","Math");
        StudentNameCourse s16=new StudentNameCourse(R.drawable.ic_student,"Shakeel","Cal");
        StudentNameCourse s17=new StudentNameCourse(R.drawable.ic_student,"Atif","Cal2");
        StudentNameCourse s18=new StudentNameCourse(R.drawable.ic_student,"Asifa","Drawing");
        StudentNameCourse s19=new StudentNameCourse(R.drawable.ic_student,"Agha","Sketching");
        StudentNameCourse s20=new StudentNameCourse(R.drawable.ic_student,"Nawab","SE");

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
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

        return studentArrayList2;
    }

    private ArrayList<StudentNameCourse> initStudentPrameterListShakar() {
        ArrayList<StudentNameCourse> studentArrayList2=new ArrayList<>();
        StudentNameCourse s1=new StudentNameCourse(R.drawable.ic_student,"Farhan","OS");
        StudentNameCourse s2=new StudentNameCourse(R.drawable.ic_student,"Ali","MC");
        StudentNameCourse s3=new StudentNameCourse(R.drawable.ic_student,"Kalsoom","CS");
        StudentNameCourse s4=new StudentNameCourse(R.drawable.ic_student,"Aisha","SE");
        StudentNameCourse s5=new StudentNameCourse(R.drawable.ic_student,"Noreen","OOP");
        StudentNameCourse s6=new StudentNameCourse(R.drawable.ic_student,"Bushra","DSA");
        StudentNameCourse s7=new StudentNameCourse(R.drawable.ic_student,"Riffat","OOP");
        StudentNameCourse s8=new StudentNameCourse(R.drawable.ic_student,"Sardar","CAL1");
        StudentNameCourse s9=new StudentNameCourse(R.drawable.ic_student,"Sajjal","Cal2");
        StudentNameCourse s10=new StudentNameCourse(R.drawable.ic_student,"Neha Kakker","Algo");
        StudentNameCourse s11=new StudentNameCourse(R.drawable.ic_student,"Madhuri","DSA");
        StudentNameCourse s12=new StudentNameCourse(R.drawable.ic_student,"Hadiqa","AI");
        StudentNameCourse s13=new StudentNameCourse(R.drawable.ic_student,"Saima","ML");
        StudentNameCourse s14=new StudentNameCourse(R.drawable.ic_student,"Noor","CV");
        StudentNameCourse s15=new StudentNameCourse(R.drawable.ic_student,"Zainab","SE");
        StudentNameCourse s16=new StudentNameCourse(R.drawable.ic_student,"Bia","Painting");
        StudentNameCourse s17=new StudentNameCourse(R.drawable.ic_student,"Zia","Graphics");
        StudentNameCourse s18=new StudentNameCourse(R.drawable.ic_student,"Asif","Layout");
        StudentNameCourse s19=new StudentNameCourse(R.drawable.ic_student,"Asghar","Painting");
        StudentNameCourse s20=new StudentNameCourse(R.drawable.ic_student,"Aisha","SE");

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
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

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