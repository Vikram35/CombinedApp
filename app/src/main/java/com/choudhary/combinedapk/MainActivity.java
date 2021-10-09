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

public class MainActivity extends AppCompatActivity {

    TextView textView ;

    EditText edit_text_emai, getEdit_text_password;

    Button login_Btn;
    private FirebaseAuth mAuth;

    private  ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.sinup_act);
        edit_text_emai = findViewById(R.id.email_edit_text);
        getEdit_text_password = findViewById(R.id.editTextTextPassword);
        login_Btn = findViewById(R.id.Login_button);
        progressBar = findViewById(R.id.progressBar);

        mAuth = FirebaseAuth.getInstance();



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,SinupActivity.class);
                startActivity(in);
            }
        });



        login_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edit_text_emai.getText().toString().trim())){
                    edit_text_emai.setError("Email is must");
                    return;
                }

                if (TextUtils.isEmpty(getEdit_text_password.getText().toString().trim())){
                  getEdit_text_password.setError("Password is must");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                logInuser(edit_text_emai.getText().toString().trim(),getEdit_text_password.getText().toString().trim());
            }
        });

    }


    private  void logInuser(String EMAIL, String Password){

        mAuth.signInWithEmailAndPassword(EMAIL, Password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this, "LoggedIn succefully", Toast.LENGTH_SHORT).show();
                            Intent in = new Intent(MainActivity.this,SelectionActivity.class);
                            startActivity(in);
                            finishAffinity();

                        } else {
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(MainActivity.this, "Error"+task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

    }
}