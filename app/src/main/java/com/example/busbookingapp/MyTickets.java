package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.busbookingapp.ui.gallery.GalleryFragment;
import com.example.busbookingapp.ui.home.HomeFragment;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyTickets extends AppCompatActivity {


    ImageView ticketback;
    CircleImageView ticketprofile;


    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tickets);

        ticketback = findViewById(R.id.ticketback);
        ticketprofile = findViewById(R.id.ticketprofile);


        ticketback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyTickets.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ticketprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyTickets.this, EditProfile.class);
                startActivity(intent);

//                FragmentManager fragmentManager = getSupportFragmentManager()
//                fragmentManager.beginTransaction().replace(R.id.content,new GalleryFragment()).addToBackStack(null).commit();
            }
        });
    }
}