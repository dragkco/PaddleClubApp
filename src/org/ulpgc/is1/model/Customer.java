package org.ulpgc.is1.model;
//Falta añadir lo del Nif
public class Customer {
    public String Name;
    public String Surname;

    public Customer(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
