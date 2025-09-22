package com.Concrete.Concrete9;

class Restaurant {
    private String name;
    private String cuisine;
    private int rating;

    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public void showInfo() {
        System.out.println(name + " serves " + cuisine + " cuisine with rating " + rating);
    }
}
