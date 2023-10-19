package org.ulpgc.is1.model;

public class Umpire {
    private final String name;
    private final String surname;

    public Umpire(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }
    @Override
    public String toString() {
        return "Arbitro: " + getName() + " - Precio: " + price + "€";
    }

}
