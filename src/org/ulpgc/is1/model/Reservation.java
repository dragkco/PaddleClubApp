package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    private final Date date;
    private final List<Extra> extras;
    private final Customer customer;
    private final Court court;

    public Reservation(Customer customer, Court court) {
        this.id = NEXT_ID++;
        this.date = new Date();
        this.extras = new ArrayList<>();
        this.customer = customer;
        this.court = court;

    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
    public int price() {
        int total = 0;

        for (Extra extra: extras) {
            total += extra.getPrice();
        }

        total += court.getPrice();

        return total;
    }



    public Customer getCustomer() {
        return customer;
    }

    public Court getCourt() {
        return court;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void addExtra(Extra extra) {
        extras.add(extra);
    }

    @Override
    public String toString() {
        String resultado = "ID de la reserva: " + id + "\n" + "Fecha de la reserva: " + date + "\n" + "Cliente:\n" + customer + "\n" + "Tipo de Pista: (\n" + court + "\n)\n";

        if (this.extras.size() > 0){
            resultado += "Extras: (\n";

            for (Extra extra : extras) {
                resultado += "    " + extra + "\n";
            }

            resultado += ")\n";
        }

        resultado += "Precio final: " + price() + "€\n";

        return resultado;
    }


}
