package com.cognizant;

public class Character {

    private String name;
    private int health;
    private int stamina;
    private int speed;
    private int strength;
    private int attackPower;

    //constructor to create character, if this isn't created the compiler would give a default constructor
    public Character(String name, int health, int stamina, int speed,int strength, int attackPower) {
        super();
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.strength = strength;
        this.attackPower = attackPower;
    }

    public Character() {
        this("Nameless Character", 0, 0, 0, 0,0);
    }

    public void run() {
        System.out.println(name + "is running arrrrrr!!!!!!");
    }

    public void attack() {
        System.out.println(name + "is ready to attack watch out!!!!!!" + attackPower);
    }

    public void heal() {
        System.out.println(name + "can heal like Wolverine, cool!");
    }

    public void decreaseHealth() {
        System.out.println(name + "is down, finish HIM!");
    }

    public void increaseStamina() {
        System.out.println(name + "oh no they're getting stronger!");
    }

    public void decreaseStamina() {
        System.out.println(name + "oh look they're weak!");
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
