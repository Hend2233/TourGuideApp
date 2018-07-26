package com.example.tito.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.places_list, parent, false);
        }

        holder = new ViewHolder();
        holder.PlaceNameText = (TextView) convertView.findViewById(R.id.place_name);
        holder.PlaceWorkingTimeText = (TextView) convertView.findViewById(R.id.place_working_time);
        holder.PlaceAddressText = (TextView) convertView.findViewById(R.id.place_address);
        holder.PlaceShortDescriptionText = (TextView) convertView.findViewById(R.id.place_short_description);
        holder.PlaceImage = (ImageView) convertView.findViewById(R.id.image);

        Places currentPlace = getItem(position);

        holder.PlaceNameText.setText(currentPlace.getPlaceName());
        holder.PlaceWorkingTimeText.setText(currentPlace.getPlaceWorkingTime());
        holder.PlaceAddressText.setText(currentPlace.getPlaceAddress());
        holder.PlaceShortDescriptionText.setText(currentPlace.getPlaceShortDescription());
        Glide.with(getContext()).load(currentPlace.getImageId()).into(holder.PlaceImage);

        return convertView;
    }

    public class ViewHolder {

        TextView PlaceNameText;

        TextView PlaceWorkingTimeText;

        TextView PlaceAddressText;

        TextView PlaceShortDescriptionText;

        ImageView PlaceImage;
    }

}