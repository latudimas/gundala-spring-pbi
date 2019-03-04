package com.mitrais.gundala.gundalapbi.models;

public class Employee {
    String name, nip;

    public Employee() {
    }

    public Employee(String name, String nip) {
        this.name = name;
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
