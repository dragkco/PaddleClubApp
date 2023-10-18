package org.ulpgc.is1.model;
//Falta añadir el date
public class Reservation {
    private int NEXT_ID = 0;
    public int id;

    public Reservation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
