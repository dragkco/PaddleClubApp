package org.ulpgc.is1.model;

public class Member extends Customer{
    private final Adress adress;
    public int points;

    public Member(int points,String Name,String Surname,Adress adress,NIF nif) {
        super(Name,Surname,nif);
        this.points = points;
        this.adress = adress;
        
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
