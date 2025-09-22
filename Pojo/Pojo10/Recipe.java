package com.Pojo.Pojo10;

class Recipe {
    private String name;
    private int servings;
    private int prepTime; // in minutes

    public Recipe() {}
    public Recipe(String name, int servings, int prepTime) {
        this.name = name;
        this.servings = servings;
        this.prepTime = prepTime;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getServings() { return servings; }
    public void setServings(int servings) { this.servings = servings; }

    public int getPrepTime() { return prepTime; }
    public void setPrepTime(int prepTime) { this.prepTime = prepTime; }

    @Override
    public String toString() {
        return "Recipe [name=" + name + ", servings=" + servings + ", prepTime=" + prepTime + " mins]";
    }
}
