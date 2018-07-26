package com.example.tito.tourguideapp;

public class Places {

    private String PlaceName;

    private String PlaceWorkingTime;

    private String PlaceAddress;

    private String PlaceShortDescription;

    private int ImageId;

    public Places(String placeName, String placeWorkingTime, String placeAddress, String placeShortDescription, int imageId) {

        PlaceName = placeName;
        PlaceWorkingTime = placeWorkingTime;
        PlaceAddress = placeAddress;
        PlaceShortDescription = placeShortDescription;
        ImageId = imageId;

    }

    public String getPlaceName() {
        return PlaceName;
    }

    public String getPlaceWorkingTime() {
        return PlaceWorkingTime;
    }

    public String getPlaceAddress() {
        return PlaceAddress;
    }

    public String getPlaceShortDescription() {
        return PlaceShortDescription;
    }

    public int getImageId() {
        return ImageId;
    }
}
