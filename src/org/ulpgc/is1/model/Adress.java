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
}
