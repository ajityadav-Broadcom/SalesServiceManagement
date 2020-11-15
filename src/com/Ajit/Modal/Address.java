package com.Ajit.Modal;

public class Address {
    private String city;
    private String state;
    private String country;
    private String streetName;

    public Address(String city, String state, String country, String streetName) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getStreetName() {
        return streetName;
    }
}
