package com.choudhary.combinedapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Model> modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("Vikram","O+","Delhi,India"));
        modelArrayList.add(new Model("Rahul","A+","Delhi,India"));
        modelArrayList.add(new Model("Vicky","B+","Delhi,India"));
        modelArrayList.add(new Model("Shubham","O-","Delhi,India"));
        modelArrayList.add(new Model("Ajay","AB+","Delhi,India"));
        modelArrayList.add(new Model("Singh ji","A+","Delhi,India"));
        modelArrayList.add(new Model("Priya","B+","Delhi,India"));
        modelArrayList.add(new Model("Rahul","A+","Delhi,India"));
        modelArrayList.add(new Model("Gaurav","O+","Delhi,India"));
        modelArrayList.add(new Model("Vikram","O+","Delhi,India"));
        modelArrayList.add(new Model("Vikram","O+","Delhi,India"));
        modelArrayList.add(new Model("Rahul","A+","Delhi,India"));
        modelArrayList.add(new Model("Vicky","B+","Delhi,India"));
        modelArrayList.add(new Model("Shubham","O-","Delhi,India"));
        modelArrayList.add(new Model("Ajay","AB+","Delhi,India"));
        modelArrayList.add(new Model("Vikram","O+","Delhi,India"));
        modelArrayList.add(new Model("Rahul","A+","Delhi,India"));
        modelArrayList.add(new Model("Vicky","B+","Delhi,India"));
        modelArrayList.add(new Model("Shubham","O-","Delhi,India"));
        modelArrayList.add(new Model("Ajay","AB+","Delhi,India"));

        myAdapter = new MyAdapter(modelArrayList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}