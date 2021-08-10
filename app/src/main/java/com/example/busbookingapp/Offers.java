package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Offers extends AppCompatActivity {

 Button offerget;

 ImageView offersback;
 CircleImageView offersprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        offerget = findViewById(R.id.offerget);
        offersback = findViewById(R.id.offersback);
        offersprofile = findViewById(R.id.offersprofile);




        offerget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Offers.this,Wallet.class);
                startActivity(intent);
            }
        });

        offersprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Offers.this,EditProfile.class);
                startActivity(intent);
            }
        });

        offersback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Offers.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
