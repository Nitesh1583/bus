package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forgotpassword1 extends AppCompatActivity {

    Button forgotnow1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword1);

        forgotnow1 = findViewById(R.id.forgotnow1);

       forgotnow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgotpassword1.this,Forgotpassword2.class);
                startActivity(intent);
            }
        });
    }
}