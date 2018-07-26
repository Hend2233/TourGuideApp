package com.example.tito.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    CardView hotelCard, restaurantCard, parkCard, historicalPlaceCard;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);

        hotelCard = (CardView) rootView.findViewById(R.id.hotels_card);
        restaurantCard = (CardView) rootView.findViewById(R.id.restaurants_card);
        parkCard = (CardView) rootView.findViewById(R.id.parks_card);
        historicalPlaceCard = (CardView) rootView.findViewById(R.id.old_cairo_card);

        hotelCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new HotelsFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        restaurantCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new RestaurantsFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        parkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new ParksFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        historicalPlaceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new HistoricalPlacesFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        parkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new ParksFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        historicalPlaceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new HistoricalPlacesFragment())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
            }
        });

        return rootView;
    }

}