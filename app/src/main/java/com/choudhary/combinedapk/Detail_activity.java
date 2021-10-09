package com.choudhary.combinedapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail_activity extends AppCompatActivity {

    ImageView profile;

    TextView Name , number , email, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activity);
        profile = findViewById(R.id.profile_full_screen);
        Name = findViewById(R.id.full_name);
        number = findViewById(R.id.full_phone);
        email = findViewById(R.id.full_email);
        address = findViewById(R.id.full_address);


        String name = getIntent().getStringExtra("NAME");
        String Email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("NUMBER");
        String Address = getIntent().getStringExtra("ADDRESS");
        String imageurl =  getIntent().getStringExtra("IMAGE_URL");




        Name.setText(name);
        number.setText(phone);
        email.setText(Email);
        address.setText(Address);

        Glide.with(this).load(imageurl).into(profile);


    }
}