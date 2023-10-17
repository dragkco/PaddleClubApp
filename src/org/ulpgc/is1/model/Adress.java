package org.ulpgc.is1.model;

public class Adress {
    public String street;
    public int number;
    public int PostalCode;
    public String city;

    public Adress(String street, int number, int postalCode, String city) {
        this.street = street;
        this.number = number;
        PostalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
