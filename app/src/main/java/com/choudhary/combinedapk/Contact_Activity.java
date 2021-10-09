package com.choudhary.combinedapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Contact_Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    ContactsAdapter contactsAdapter;
    ArrayList<ModelContact> modelContactArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_);

        recyclerView = findViewById(R.id.recyer_view_contact);
        modelContactArrayList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        contactsAdapter = new ContactsAdapter(this,modelContactArrayList);
        recyclerView.setAdapter(contactsAdapter);

       loadData();


    }


    private  void loadData(){

        modelContactArrayList.add(new ModelContact("Vikram","12354789","Vikram@gmail.com","Ranchi,Jharkhand","https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Rahul","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Priya","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vicky","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/2726111/pexels-photo-2726111.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vishal","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1382731/pexels-photo-1382731.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Riya","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1080213/pexels-photo-1080213.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Subodh","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Ankit","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Komal","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/678783/pexels-photo-678783.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vinay","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1559486/pexels-photo-1559486.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vinay","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1559486/pexels-photo-1559486.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vinay","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1559486/pexels-photo-1559486.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        modelContactArrayList.add(new ModelContact("Vinay","12354789","Vikram@gmail.com","RAnchi Dhanbad","https://images.pexels.com/photos/1559486/pexels-photo-1559486.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));


        contactsAdapter.notifyDataSetChanged();


    }




}