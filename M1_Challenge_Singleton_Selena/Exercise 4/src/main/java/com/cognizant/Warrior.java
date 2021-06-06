package com.cognizant;

public class Warrior extends Character{

    private int shieldStrength;

    public Warrior (String name) {
        super(name, 100, 100, 50, 75,10);
        this.shieldStrength = 100;
    }
    public void decreaseShieldStrength() {
        System.out.println("help I'm getting weaker!");
    }
}
