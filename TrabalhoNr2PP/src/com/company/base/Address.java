package com.company.base;

import order.base.IAddress;

public class Address implements IAddress {
    String city;
    String country;
    int number;
    String State;
    String street;

    public Address(String city, String country, int number, String state, String street) {
        this.city = city;
        this.country = country;
        this.number = number;
        State = state;
        this.street = street;
    }

    @Override
    public String getCity() {
        return null;
    }

    @Override
    public String getCountry() {
        return null;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public String getStreet() {
        return null;
    }

    @Override
    public void setCity(String s) {

    }

    @Override
    public void setCountry(String s) {

    }

    @Override
    public void setNumber(int i) {

    }

    @Override
    public void setState(String s) {

    }

    @Override
    public void setStreet(String s) {

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", number=" + number +
                ", State='" + State + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
