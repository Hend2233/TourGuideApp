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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.fustat_park), getString(R.string.fustat_park_time),
                getString(R.string.fustat_park_address),
                "", R.drawable.fustat_park_cairo));

        places.add(new Places(getString(R.string.orman_park), getString(R.string.orman_park_time),
                getString(R.string.orman_park_address),
                getString(R.string.orman_park_description), R.drawable.orman_park));

        places.add(new Places(getString(R.string.giza_zoo), getString(R.string.giza_zoo_time),
                getString(R.string.giza_zoo_address),
                getString(R.string.giza_zoo_description), R.drawable.giza_zoo_cairo));

        places.add(new Places(getString(R.string.al_azhar_park), getString(R.string.al_azhar_park_time),
                getString(R.string.al_azhar_park_address),
                getString(R.string.al_azhar_park_description), R.drawable.al_azhar_park));

        places.add(new Places(getString(R.string.aquarium_grotto_garden), getString(R.string.aquarium_grotto_garden_time),
                getString(R.string.aquarium_grotto_garden_address),
                "", R.drawable.aquarium_grotto_garden_by_hatem_moushir_cairo));

        places.add(new Places(getString(R.string.safari_park), "",
                getString(R.string.safari_park_address),
                getString(R.string.safari_park_description), R.drawable.safari_park_cairo));

        places.add(new Places(getString(R.string.el_andalos_park), getString(R.string.el_andalos_park_time),
                getString(R.string.el_andalos_park_address), "", R.drawable.al_andalus_park_cairo));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);

        listView.setAdapter(adapter);

        return rootView;
    }

}
