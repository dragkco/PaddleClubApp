package org.ulpgc.is1.model;
//Falta añadir el date
public class Reservation {
    private int NEXT_ID = 0;
    public int id;
    private Customer customer;
    private Court court;

    public Reservation(int id, Customer customer, Court court) {
        this.id = id;
        this.customer = customer;
        this.court = court;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
