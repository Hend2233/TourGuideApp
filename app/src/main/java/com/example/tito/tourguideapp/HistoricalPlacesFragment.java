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
public class HistoricalPlacesFragment extends Fragment {


    public HistoricalPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.egypt_pyramids), "", getString(R.string.egypt_pyramids_address),
                getString(R.string.egypt_pyramids_description), R.drawable.giza_pyramids));

        places.add(new Places(getString(R.string.salah_el_din_al_ayouby_citadel), "", getString(R.string.salah_el_din_al_ayouby_citadel_address),
                getString(R.string.salah_el_din_al_ayouby_citadel_description), R.drawable.salah_el_din_citadel));

        places.add(new Places(getString(R.string.egyptian_museum_cairo),
                "", getString(R.string.egyptian_museum_cairo_address),
                getString(R.string.egyptian_museum_cairo_description), R.drawable.egyptain_museum));

        places.add(new Places(getString(R.string.museum_of_islamic_art_cairo), getString(R.string.museum_of_islamic_art_cairo_time),
                getString(R.string.museum_of_islamic_art_cairo_address),
                getString(R.string.museum_of_islamic_art_cairo_description), R.drawable.islamic_museum_cairo));

        places.add(new Places(getString(R.string.al_azhar_mosque), "",
                getString(R.string.al_azhar_mosque_address),
                getString(R.string.al_azhar_mosque_description), R.drawable.al_azhar_mosqu));

        places.add(new Places(getString(R.string.the_hanging_church), "",
                getString(R.string.the_hanging_church_address),
                getString(R.string.the_hanging_church_description), R.drawable.cairo_hanging_church_egypt));

        places.add(new Places(getString(R.string.khan_el_khalili), "",
                getString(R.string.khan_el_khalili_address),
                getString(R.string.khan_el_khalili_description), R.drawable.khan_el_khalili_bazar));

        places.add(new Places(getString(R.string.national_military_museum_egypt), getString(R.string.national_military_museum_egypt_time),
                getString(R.string.national_military_museum_egypt_address),
                getString(R.string.national_military_museum_egypt_description), R.drawable.military_cairo_museum));

        places.add(new Places(getString(R.string.cairo_tower), getString(R.string.cairo_tower_time),
                getString(R.string.cairo_tower_address),
                getString(R.string.cairo_tower_description), R.drawable.cairo_tower));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);

        listView.setAdapter(adapter);

        return rootView;
    }

}
