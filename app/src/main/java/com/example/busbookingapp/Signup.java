package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.busbookingapp.ui.gallery.GalleryFragment;

public class Signup extends AppCompatActivity {

    Button signup;
    TextView signin2,editpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.signup);

        signin2 = findViewById(R.id.signin2);
        editpen = findViewById(R.id.editpen);


     //   getSupportFragmentManager().beginTransaction().add(R.id.editpen,new GalleryFragment()).commit();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, SignIn.class);
                startActivity(intent);
            }
        });

        signin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, SignIn.class);
                startActivity(intent);
            }
        });

//        editpen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (view.getId()==R.id.editpen)
//                {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.editpen,new ProfileFragment()).commit();
//                }
//            }
//        });
    }
}