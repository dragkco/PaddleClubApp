package org.ulpgc.is1.model;

public class Member extends Customer{
    public int points;

    public Member(int points,String Name,String Surname,String Street,String city,String,int number,int postalCode) {
        super(Name,Surname);
        this.points = points;
        setAdresss(Street,city,postalCode,number)
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
