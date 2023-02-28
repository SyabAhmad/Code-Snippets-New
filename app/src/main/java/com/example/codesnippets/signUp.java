package com.example.codesnippets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


import org.w3c.dom.Document;

public class signUp extends AppCompatActivity {

    protected Button login1;
    protected Button signUp1;
    protected EditText mail1;
    protected EditText pass1;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        login1 = (Button) findViewById(R.id.logIn1);
        signUp1 = (Button) findViewById(R.id.signUp1);
        mail1 = (EditText) findViewById(R.id.mail1);
        pass1 = (EditText) findViewById(R.id.pinCode1);
        firebaseAuth = FirebaseAuth.getInstance();

        signUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mail1.length() == 0)
                {
                    mail1.setError("E mail is required");
                    return;
                }
                if (pass1.length() == 0)
                {
                    pass1.setError("Password is required");
                    return;
                }

                if (pass1.length() < 6)
                {
                    pass1.setError("Password must be at least 6 digits");
                }
                String mail2 = mail1.getText().toString().trim();
                String pass2 = pass1.getText().toString().trim();

                firebaseAuth.createUserWithEmailAndPassword(mail2,pass2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Toast toast = Toast.makeText(getApplicationContext(),"Account Created", Toast.LENGTH_SHORT);
                            toast.show();
                            sendVerificationEmail();
                        }else{
                            Toast toast = Toast.makeText(getApplicationContext(),"Failed to register", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                });

//                Toast toast = Toast.makeText(getApplicationContext(),"Sign Up Coming Soon", Toast.LENGTH_SHORT);
//                toast.show();
            }
        });

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(signUp.this, MainActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(),"Welcome to Code Snippets", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    public void sendVerificationEmail()
    {
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser!=null)
        {
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Verification email has bean send", Toast.LENGTH_SHORT);
                    toast.show();
                    firebaseAuth.signOut();
                    startActivity(new Intent(signUp.this, MainActivity.class));
                }
            });
        }else {
            Toast toast = Toast.makeText(getApplicationContext(),"Failed to send verification Email", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}