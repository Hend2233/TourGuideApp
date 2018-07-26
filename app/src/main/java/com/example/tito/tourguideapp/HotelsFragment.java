package com.example.tito.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.four_seasons_hotel), "",
                getString(R.string.four_seasons_hotel_address),
                getString(R.string.four_seasons_hotel_description), R.drawable.four_seasons_hotel));

        places.add(new Places(getString(R.string.kempinski_nile_hotel), "",
                getString(R.string.kempinski_nile_hotel_address),
                getString(R.string.kempinski_nile_hotel_description), R.drawable.kempinski_nile_hotel_2));

        places.add(new Places(getString(R.string.steigenberger_hotel), "",
                getString(R.string.steigenberger_hotel_address),
                getString(R.string.steigenberger_hotel_description), R.drawable.steigen_berger_hotel));

        places.add(new Places(getString(R.string.sofitel_cairo_nile_el_gezirah), "",
                getString(R.string.sofitel_cairo_nile_el_gezirah_address),
                getString(R.string.sofitel_cairo_nile_el_gezirah_description), R.drawable.sofitel_hotel_cairo));

        places.add(new Places(getString(R.string.safir_hotel_cairo), "",
                getString(R.string.safari_park_address),
                getString(R.string.safir_hotel_cairo_description), R.drawable.safir_hotel_cairo));

        places.add(new Places(getString(R.string.intercontinental_hotel), "",
                getString(R.string.intercontinental_hotel_address),
                getString(R.string.intercontinental_hotel_description), R.drawable.intercontinental_cairo_citystars_hotel));

        places.add(new Places(getString(R.string.grand_nile_tower), "",
                getString(R.string.grand_nile_tower_address),
                getString(R.string.grand_nile_tower_description), R.drawable.grand_nile_tower_hotel_cairo));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);

        listView.setAdapter(adapter);

        return rootView;
    }

}