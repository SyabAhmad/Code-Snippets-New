package com.example.codesnippets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    protected Button logInButton;
    protected Button register;
    protected Button forgotPassword;
    protected EditText mail;
    protected EditText pass;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //// buttons

         logInButton = (Button) findViewById(R.id.login);
         register = (Button) findViewById(R.id.registerNow);
         forgotPassword = (Button) findViewById(R.id.forgotPassword);
         mail = (EditText) findViewById(R.id.mail);
        pass = (EditText) findViewById(R.id.pinCode);
        firebaseAuth =FirebaseAuth.getInstance();
         logInButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 if (mail.length() == 0)
                 {
                     mail.setError("E mail is required");
                     return;
                 }
                 if (pass.length() == 0)
                 {
                     pass.setError("Password is required");
                     return;
                 }

                 if (pass.length() < 6)
                 {
                     pass.setError("Password must be at least 6 digits");
                 }
                 String mail3 = mail.getText().toString().trim();
                 String pass3 = pass.getText().toString().trim();
                 firebaseAuth.signInWithEmailAndPassword(mail3,pass3).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful())
                         {
                             validationEmail();

                         }else {
                             Toast toast = Toast.makeText(getApplicationContext(),"Incorrect Details", Toast.LENGTH_SHORT);
                             toast.show();
                         }
                     }
                 });

//                 finish();
//                 startActivity(new Intent(MainActivity.this, Home.class));
//                 Toast toast = Toast.makeText(getApplicationContext(),"Testing View", Toast.LENGTH_SHORT);
//                 toast.show();
             }
         });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(MainActivity.this, signUp.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(),"Welcome to Code Snippets", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validationEmailForPassword();
//                Toast toast = Toast.makeText(getApplicationContext(),"Coming Soon", Toast.LENGTH_SHORT);
//                toast.show();
            }
        });

    }

    public void validationEmailForPassword()
    {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser.isEmailVerified())
        {
            firebaseAuth.sendPasswordResetEmail(mail.getText().toString().trim()).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful())
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),"Email has bean Send to you Email", Toast.LENGTH_SHORT);
                        toast.show();
                    }else {
                        Toast toast = Toast.makeText(getApplicationContext(),"There is some error with you email", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });

        }else {
            Toast toast = Toast.makeText(getApplicationContext(),"Verify your E-mail first", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void validationEmail()
    {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser.isEmailVerified())
        {
            finish();
            startActivity(new Intent(MainActivity.this, Home.class));
            Toast toast = Toast.makeText(getApplicationContext(),"Logged in", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Toast toast = Toast.makeText(getApplicationContext(),"Verify your E-mail first", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}