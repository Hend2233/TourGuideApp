package com.example.tito.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.osmanly_restaurant_name), "", getString(R.string.osmanly_address),
                getString(R.string.osmanly_restaurant), R.drawable.osmanly_restaurant));

        places.add(new Places(getString(R.string.tabla_restaurant), "", getString(R.string.tabla_address),
                getString(R.string.tabla_description), R.drawable.andrea_el_mariouteya_restaurant));

        places.add(new Places(getString(R.string.birdcage_restaurant), "", getString(R.string.birdcage_address),
                getString(R.string.birdcage_description), R.drawable.birdcage_restaurant_cairo));

        places.add(new Places(getString(R.string.fasahet_somaya), "", getString(R.string.fasahet_somaya_address),
                getString(R.string.fasahet_somaya_description), R.drawable.fasahet_somaya_restaurant_cairo));

        places.add(new Places(getString(R.string.little_swiss_restaurant), "", getString(R.string.little_swiss_address),
                getString(R.string.little_swiss_description), R.drawable.little_swiss_restaurant_cairo));

        places.add(new Places(getString(R.string.sequoia_restaurant), "", getString(R.string.sequoia_address),
                getString(R.string.sequoia_description), R.drawable.sequoia_restaurant_cairo));

        places.add(new Places(getString(R.string.zooba_restaurant), "", getString(R.string.zooba_address),
                getString(R.string.zooba_description), R.drawable.zooba_restaurant_cairo));

        places.add(new Places(getString(R.string.tabla_restaurant), "", getString(R.string.tabla_address),
                getString(R.string.tabla_description), R.drawable.tabla_luna_restaurant));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);

        listView.setAdapter(adapter);

        return rootView;
    }

}