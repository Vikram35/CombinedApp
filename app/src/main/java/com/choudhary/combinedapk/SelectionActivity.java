package com.choudhary.combinedapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SelectionActivity extends AppCompatActivity {

    Button btn1, btn2 , btn3, btn4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        btn1 = findViewById(R.id.selction_blood);
        btn2 = findViewById(R.id.selection_contACT);
        btn3 = findViewById(R.id.full_logout);
        btn4 = findViewById(R.id.selection_firebse);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(SelectionActivity.this,HomeActivity.class);
                startActivity(in);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(SelectionActivity.this,Contact_Activity.class);
                startActivity(in);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent ra = new Intent(SelectionActivity.this,MainActivity.class);
                startActivity(ra);
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent sa = new Intent(SelectionActivity.this,SinupActivity.class);
              startActivity(sa);
             // finish();
            }
        });
    }
}