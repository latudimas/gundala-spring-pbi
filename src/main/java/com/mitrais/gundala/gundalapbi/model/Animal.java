package com.mitrais.gundala.gundalapbi.model;

public class Animal {

    private int leg;
    private String origin;
    private String name;

    public Animal(){}

    public Animal (int leg, String origin, String name) {
        this.leg = leg;
        this.origin = origin;
        this.name = name;
    }

    /**
     * Getter and Setter for instance
     */
    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
