package org.ulpgc.is1.model;

public class Equipment extends Extra {
    public String name;

    public Equipment(String name,int price) {
        super(price);
        this.name = name;
    }

    public String getName() {
        return "Equipamiento:" + name + "  " + price +"€";
    }

    public void setName(String name) {
        this.name = name;
    }
}
