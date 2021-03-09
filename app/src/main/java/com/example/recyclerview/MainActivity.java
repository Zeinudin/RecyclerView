package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Zeinudin", "Lirov", R.drawable.iam));
        students.add(new Student("Slark", "Doat2", R.drawable.z2));
        students.add(new Student("Anti Mage", "Dota2", R.drawable.z3));
        students.add(new Student("Sniper", "Dota2", R.drawable.z4));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        students.add(new Student("Dota 2", "Valve", R.drawable.iam));
        students.add(new Student("Slark", "Doat2", R.drawable.z2));
        students.add(new Student("Anti Mage", "Dota2", R.drawable.z3));
        students.add(new Student("Sniper", "Dota2", R.drawable.z4));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        students.add(new Student("Dota 2", "Valve", R.drawable.iam));
        students.add(new Student("Slark", "Doat2", R.drawable.z2));
        students.add(new Student("Anti Mage", "Dota2", R.drawable.z3));
        students.add(new Student("Sniper", "Dota2", R.drawable.z4));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        students.add(new Student("Sniper", "Dota2", R.drawable.z4));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        students.add(new Student("Sniper", "Dota2", R.drawable.z4));
        students.add(new Student("Windrage", "Dota2", R.drawable.z5));
        Adapter adapter = new Adapter(students);
        recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
    }
}