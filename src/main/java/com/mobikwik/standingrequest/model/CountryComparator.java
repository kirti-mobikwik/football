package com.mobikwik.standingrequest.model;

import lombok.Data;

@Data
public class CountryComparator {
    private String countryName;
    public CountryComparator(String countryName){
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
