package org.ulpgc.is1.model;
//Falta añadir el date
public class Reservation {
    private int NEXT_ID = 0;
    private int id;
    private Customer customer;
    private Court court;

    public Reservation(int id, Customer customer, Court court) {
        this.id = id;
        this.court = court;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
