package com.example.busbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Wallet extends AppCompatActivity {

ImageView debit,netbanking,upi,walletback;

Button wallettop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);


        debit= findViewById(R.id.debit);
        netbanking= findViewById(R.id.netbanking);
        upi= findViewById(R.id.upi);

        wallettop= findViewById(R.id.wallettop);
        walletback= findViewById(R.id.walletback);


        debit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,PaymentSuccessful.class);
                startActivity(intent);
            }
        });

        netbanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,PaymentSuccessful.class);
                startActivity(intent);
            }
        });


        upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,PaymentSuccessful.class);
                startActivity(intent);
            }
        });
        walletback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,MainActivity.class);
                startActivity(intent);
            }
        });
        wallettop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Wallet.this,WalletTopup.class);
                startActivity(intent);
            }
        });

    }
}