package com.th3snehasish.tripit.Utils;

import java.util.ArrayList;

/**
 * Created by Snehasish Nayak on 01/01/17.
 */
public class PlaceListDetail {

    private String place_name, place_id;
    Double place_rating;
    private ArrayList<String> photo_reference;
    private String place_address, icon_url;

    public PlaceListDetail() {

    }

    public PlaceListDetail(String place_name, String place_address, String icon_url, String place_id) {
        this.place_address = place_address;
        this.place_name = place_name;
        this.icon_url = icon_url;
        this.place_id = place_id;
    }

    public void setPlace_rating(Double place_rating) {
        this.place_rating = place_rating;
    }

    public Double getPlace_rating() {
        return place_rating;
    }

    public void setPhoto_reference(ArrayList<String> photo_reference) {
        this.photo_reference = photo_reference;
    }

    public ArrayList<String> getPhoto_reference() {
        return photo_reference;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public void setPlace_address(String place_address) {
        this.place_address = place_address;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public String getPlace_address() {
        return place_address;
    }

    public String getPlace_name() {
        return place_name;
    }
}
