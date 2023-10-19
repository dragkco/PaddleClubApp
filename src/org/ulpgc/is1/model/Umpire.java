package org.ulpgc.is1.model;

public class Umpire extends  Extra{
    private final String name;
    private final String surname;

    public Umpire(String name, String surname,int price) {
        super(price);
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name + " " + surname;
    }
    @Override
    public String toString() {
        return "Arbitro: " + getName() + " - Precio: " + price + "€";
    }

}
