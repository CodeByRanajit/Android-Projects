package com.example.rvthree;

public class Product {
    private String name;
    private String description;
    private double price;
    String  imageurl;

    // Required empty constructor
    public Product() {}

    public Product(String name, String description, double price,String imageurl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageurl=imageurl;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImageurl() {
        return imageurl;
    }
}
