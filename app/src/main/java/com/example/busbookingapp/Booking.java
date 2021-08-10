package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Booking extends AppCompatActivity {

    ImageView bookingback;

    CircleImageView bookingprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
//
//        bookingback = findViewById(R.id.bookingback);
//
//        bookingback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Booking.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        bookingprofile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Booking.this,EditProfile.class);
//                startActivity(intent);
//            }
//        });
    }
}