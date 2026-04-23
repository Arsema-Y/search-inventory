package com.pluralsight;

public class Product {
    //attributes/(data) fields/ data members
    private int id;
    private String name;
    private float price;

    //constructor (parameters)
    public Product(int id, String name, float price) {
        //attributes <~ parameters <~ arguments
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }

}
