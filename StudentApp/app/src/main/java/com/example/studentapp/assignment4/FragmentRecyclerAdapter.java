package com.example.studentapp.assignment4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentapp.R;

import java.util.ArrayList;

public class FragmentRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    ArrayList<StudentNameCourse> studentNameCoursesArrayList=new ArrayList<StudentNameCourse>();
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.studentnamecourse,parent,false);
        return new FragmentRecyclerAdapter.StudentNCViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StudentNameCourse st=studentNameCoursesArrayList.get(position);
        FragmentRecyclerAdapter.StudentNCViewHolder studentNCViewHolder= (FragmentRecyclerAdapter.StudentNCViewHolder) holder;

        studentNCViewHolder.studentName.setText(st.getName());
        studentNCViewHolder.studentCourse.setText(st.getCourse());
        studentNCViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), st.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentNameCoursesArrayList.size();
    }

    public void setData(ArrayList<StudentNameCourse> StudentArrayList){
        this.studentNameCoursesArrayList=StudentArrayList;
        notifyDataSetChanged();

    }

    //to find views of single list xml file
    public static class StudentNCViewHolder extends RecyclerView.ViewHolder{

        TextView studentName;
        TextView studentCourse;
        public StudentNCViewHolder(@NonNull View itemView) {
            super(itemView);

            studentName=itemView.findViewById(R.id.naam);
            studentCourse=itemView.findViewById(R.id.course);

        }
    }
}
