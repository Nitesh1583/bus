package com.example.busbookingapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.busbookingapp.Booking;
import com.example.busbookingapp.FindBus;
import com.example.busbookingapp.MainActivity;
import com.example.busbookingapp.MyTickets;
import com.example.busbookingapp.R;
import com.example.busbookingapp.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    Button topup;

    TextView city1,city2,city3,city4,homefindbus;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        city1 = view.findViewById(R.id.city1);
        city2 = view.findViewById(R.id.city2);
        city3 = view.findViewById(R.id.city3);
        city4 = view.findViewById(R.id.city4);
        homefindbus = view.findViewById(R.id.homefindbus);
        topup = view.findViewById(R.id.topup);


        topup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content,new GalleryFragment()).addToBackStack(null).commit();
            }
        });

        homefindbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Booking.class);
                startActivity(intent);
            }
        });


        city1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),FindBus.class);
                startActivity(intent);
            }
        });

        city2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),FindBus.class);
                startActivity(intent);
            }
        });

        city3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),FindBus.class);
                startActivity(intent);
            }
        });

        city4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),FindBus.class);
                startActivity(intent);
            }
        });


        return view;


    }
}