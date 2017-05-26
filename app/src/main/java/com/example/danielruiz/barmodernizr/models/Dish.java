package com.example.danielruiz.barmodernizr.models;



public class Dish {

    private int mPhotoReference;
    private float mPrice;
    private String mName;
    private String mDescription;
    private boolean mGlutenFree;
    private boolean mLactoseFree;
    private boolean mForVegetarians;

    public Dish(
            int photoReference,
            float price,
            String name,
            String description
    ) {
        mPhotoReference = photoReference;
        mPrice = price;
        mName = name;
        mDescription = description;
        mGlutenFree = false;
        mLactoseFree = false;
        mForVegetarians = false;
    }

    public int getPhotoReference() {
        return mPhotoReference;
    }

    public void setPhotoReference(int photoReference) {
        mPhotoReference = photoReference;
    }

    public float getPrice() {
        return mPrice;
    }

    public void setPrice(float price) {
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isGlutenFree() {
        return mGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        mGlutenFree = glutenFree;
    }

    public boolean isLactoseFree() {
        return mLactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        mLactoseFree = lactoseFree;
    }

    public boolean isForVegetarians() {
        return mForVegetarians;
    }

    public void setForVegetarians(boolean forVegetarians) {
        mForVegetarians = forVegetarians;
    }
}
