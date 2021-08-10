package com.example.busbookingapp.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.busbookingapp.EditProfile;
import com.example.busbookingapp.MyTickets;
import com.example.busbookingapp.Offers;
import com.example.busbookingapp.R;
import com.example.busbookingapp.SignIn;
import com.example.busbookingapp.Wallet;
import com.example.busbookingapp.ui.slideshow.SlideshowFragment;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
//
//    ImageView profileback;
//    CircleImageView profileg;
//
TextView editprofile,ticketprofile,walletprofile,offerprofile,logoutprofile,transactionprofile;
//


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
editprofile = view.findViewById(R.id.editprofile);
        ticketprofile = view.findViewById(R.id.ticketprofile);
       walletprofile = view.findViewById(R.id.walletprofile);
        transactionprofile = view.findViewById(R.id.transactionprofile);
        offerprofile = view.findViewById(R.id.offerprofile);
     logoutprofile = view.findViewById(R.id.logoutprofile);
//        profileback = view.findViewById(R.id.profileback);
//        profileg = view.findViewById(R.id.profileg);
//
//
//
//        profileback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                Intent intent = new Intent(getActivity(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
//

        editprofile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), EditProfile.class);
        startActivity(intent);
    }
});
//
//
        ticketprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), MyTickets.class);
                startActivity(intent);
            }
        });
//
//

        logoutprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), SignIn.class);
                startActivity(intent);

            }
        });
//

        walletprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), Wallet.class);
                startActivity(intent);
            }
        });

        transactionprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content,new SlideshowFragment()).addToBackStack(null).commit();
//
//                Intent intent = new Intent(getActivity(), Transactions.class);
//                startActivity(intent);
            }
        });
        offerprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), Offers.class);
                startActivity(intent);
            }
        });
        return view;
    }
}


