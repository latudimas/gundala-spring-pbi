package com.mitrais.gundala;

public class Book {
    private int id;
    private String name;

//    public Book(){} //constructor injection

    //setter injector
    public Book (String bookTitle){
        this.name = bookTitle;
    }

    public int getId() {
        return id;
    }

    //setter injector
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    //setter injector
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Title=" + name + '}';
    }

}