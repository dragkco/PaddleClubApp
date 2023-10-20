package org.ulpgc.is1.model;

import java.util.ArrayList;

//Falta añadir addMember además de cambiar unas cuantas funciones de otras clases
public class PaddleManager{
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Court> courtList = new ArrayList<>();
    ArrayList<Reservation> reservationList = new ArrayList<>();
    public PaddleManager() {
    }

    public void addCustomer(String name, String surname, NIF nif){
        customerList.add(new Customer(name, surname, nif));
    }

    public void addMember(String name, String surname, Adress adress, NIF nif){
        customerList.add(new Member(0, name, surname, adress, nif));
    }

    public void removeCustomer(int index){
        customerList.remove(index);
    }

    public void addCourt(String name, int price, CourtType type){
        courtList.add(new Court(name, price, type));
    }

    public void removeCourt(int index){
        courtList.remove(index);
    }

    public Customer getCustomer(int index){
        return customerList.get(index);
    }

    public ArrayList<Customer> countCustomer(){
        return customerList;
    }

    public Court getCourt(int index){
        return courtList.get(index);
    }

    public ArrayList<Court> countCourt(){
        return courtList;
    }

    public void reserve(int index1, int index2){
        Customer customer = getCustomer(index1);
        Court court = getCourt(index2);
        reservationList.add(new Reservation(customer, court));
    }

    public Reservation getReservation(int index){
        return reservationList.get(index);
    }

    public ArrayList<Reservation> countReservation(){
        return reservationList;
    }
}
