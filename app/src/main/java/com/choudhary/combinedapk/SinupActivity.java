package com.choudhary.combinedapk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SinupActivity extends AppCompatActivity {

    TextView login_activity;
    EditText email, password, confirmpass;

    Button sinup;

    ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinup);


        login_activity = findViewById(R.id.login_act);
        email = findViewById(R.id.edit_email_sinup);
        password = findViewById(R.id.password_sinup);
        confirmpass = findViewById(R.id.confirmpass_sin);
        sinup = findViewById(R.id.sinup_btn);
        progressBar = findViewById(R.id.progrss_sinup);

        mAuth = FirebaseAuth.getInstance();



        sinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (TextUtils.isEmpty(email.getText().toString().trim())){
                   email.setError("Please enter email");
                   return;
               }

               if (TextUtils.isEmpty(password.getText().toString().trim())){
                   password.setError("Enter your Password");
                   return;
               }

               if (TextUtils.isEmpty(confirmpass.getText().toString().trim())){
                   confirmpass.setError("Password not matched");
                   return;
               }

               if (!password.getText().toString().trim().equals(confirmpass.getText().toString().trim())){
                   confirmpass.setError("Password not matcged");
                   return;
               }

               String EMAIL = email.getText().toString().trim();
               String PASSWORD = password.getText().toString().trim();
               progressBar.setVisibility(View.VISIBLE);

               sinUp(EMAIL,PASSWORD);

            }
        });


         login_activity.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent to = new Intent(SinupActivity.this,MainActivity.class);
                 startActivity(to);
                 finish();
             }
         });


    }

    private void sinUp(String  mail , String pass){

        mAuth.createUserWithEmailAndPassword(mail, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Toast.makeText(SinupActivity.this, "Sinup Succefully ", Toast.LENGTH_SHORT).show();
                            Intent in = new Intent(SinupActivity.this, SelectionActivity.class);
                            progressBar.setVisibility(View.INVISIBLE);
                            startActivity(in);
                            finishAffinity();


                        } else {
                            Toast.makeText(SinupActivity.this, "Error : "+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.INVISIBLE);

                        }
                    }
                });
    }




}