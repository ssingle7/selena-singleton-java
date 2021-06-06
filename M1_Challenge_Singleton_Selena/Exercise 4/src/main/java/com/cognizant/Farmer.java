package com.cognizant;

public class Farmer extends Character {
    public Farmer (String name) {
        super(name, 100, 75, 10, 75,1);
    }

    public void plow() {
        System.out.println(getName() + "is plowing the field vigorously!");
    }

    public void harvest() {
        System.out.println(getName() + "says it's time for harvest!");
    }

}
