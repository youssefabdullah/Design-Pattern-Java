package org.example.Factory;

public abstract class Enemy {
    private String name;
    private int damge;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamge() {
        return damge;
    }

    public void setDamge(int damge) {
        this.damge = damge;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void showUp(){
        System.out.printf("%s is showing up. Damage is %d Health is %d%n",getName(),getDamge(),getHealth());
    }
}
