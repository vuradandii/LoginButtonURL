package com.example.recyclerviewtoastactivity.model;

public class FoodModel {
    String name, Description;
    int image;

    public FoodModel(String name, String description, int image) {
        this.name = name;
        Description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
