package org.ulpgc.is1.model;

import java.util.ArrayList;

//Falta añadir addMember además de cambiar unas cuantas funciones de otras clases
public class PaddleManager{
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Court> courtList = new ArrayList<>();
    public PaddleManager() {
    }

    public void addCustomer(String name, String surname){
        customerList.add(new Customer(name, surname));
    }

    public void addCourt(String name, int price){
        courtList.add(new Court(name, price));
    }

    public Customer getCustomer(int index){
        return customerList.get(index);
    }

    public Court getCourt(int index){
        return courtList.get(index);
    }

    public void reserve(){

    }
}
