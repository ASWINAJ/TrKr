package com.example.android.home;

/**
 * Created by aswin on 23/4/16.
 */
public class Flats {

    private int image;
    private String flat_name;
    private String aminities;
    private String place;
    private String price;
    private String area;
    private String onbuilt;
    private String age;
    private int extra;

    public Flats(int image, String flat_name, String aminities, String place, String price, String area, String onbuilt, String age,int extra) {
        this.image = image;
        this.flat_name = flat_name;
        this.aminities = aminities;
        this.place = place;
        this.price = price;
        this.area = area;
        this.onbuilt = onbuilt;
        this.age = age;
        this.extra = extra;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getImage() {
        return image;
    }

    public String getFlat_name() {
        return flat_name;
    }

    public String getAminities() {
        return aminities;
    }

    public String getPlace() {
        return place;
    }

    public String getPrice() {
        return price;
    }

    public String getArea() {
        return area;
    }

    public String getOnbuilt() {
        return onbuilt;
    }

    public String getAge() {
        return age;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setFlat_name(String flat_name) {
        this.flat_name = flat_name;
    }

    public void setAminities(String aminities) {
        this.aminities = aminities;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setOnbuilt(String onbuilt) {
        this.onbuilt = onbuilt;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
