package com.cognizant;

public class Constable extends Character {
    private String jurisdiction;

    public Constable (String name, String jurisdiction) {
        super(name,100, 60, 20, 60,5);
        this.jurisdiction = jurisdiction;
    }
    public void arrest() {
        System.out.println(getName() + "watch out before I arrest you!");
    }
}
