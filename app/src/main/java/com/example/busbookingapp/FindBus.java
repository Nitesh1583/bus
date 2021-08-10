package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.busbookingapp.ui.gallery.GalleryFragment;

import de.hdodenhof.circleimageview.CircleImageView;

public class FindBus extends AppCompatActivity {

    ImageView findback;
   CircleImageView findprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_bus);

        findback = findViewById(R.id.findback);
        findprofile = findViewById(R.id.findprofile);

findback.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(FindBus.this,MainActivity.class);
        startActivity(intent);
    }
});

findprofile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(FindBus.this,EditProfile.class);
        startActivity(intent);
    }
});

    }
}