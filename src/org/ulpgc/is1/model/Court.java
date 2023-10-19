package org.ulpgc.is1.model;

import java.util.Objects;

public class Court {
    private final String name;
    private final int price;
    private final CourtType courtType;

    public Court(String name, int price,CourtType courtType) {
        this.name = name;
        this.price = price;
        this.courtType = courtType;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public CourtType getType() {
        return courtType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Court court = (Court) o;
        return price == court.price &&
                Objects.equals(name, court.name) &&
                courtType == court.courtType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, courtType);
    }

    @Override
    public String toString() {
        return "Nombre de la pista: " + name + "\n" + "Precio: " + price + "€\n" + "Tipo de pista: " + courtType;
    }


}
