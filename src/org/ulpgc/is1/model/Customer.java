package org.ulpgc.is1.model;

import java.util.Objects;

//Falta añadir lo del Nif
public class Customer {
    protected String name;
    protected String surname;
    protected NIF nif;

    public Customer(String name, String surname, NIF nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nif);
    }
    @Override
    public String toString() {
        return "Nombre: " + name + "\n" + "Apellido: " + surname + "\n" + "NIF: " + nif;
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null || getClass() != x.getClass()) return false;
        Customer customer = (Customer) x;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(nif, customer.nif);
    }
}

