package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Transaction extends AppCompatActivity {

    ImageView transback;
    CircleImageView transprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        transback = findViewById(R.id.transback);
        transprofile = findViewById(R.id.transprofile);


        transback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Transaction.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        transprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Transaction.this,EditProfile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}