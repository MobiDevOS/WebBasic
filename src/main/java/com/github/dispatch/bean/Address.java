package com.github.dispatch.bean;

public class Address {
    @Override
    public String toString() {
        return "Address{" +
                "mCity='" + mCity + '\'' +
                '}';
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    private String mCity;
}
