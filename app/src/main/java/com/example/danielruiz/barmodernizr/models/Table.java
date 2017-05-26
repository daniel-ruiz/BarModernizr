package com.example.danielruiz.barmodernizr.models;

import java.util.ArrayList;

public class Table {

    private ArrayList<Dish> mDishes;

    public Table() {
        mDishes = new ArrayList<>();
    }

    public ArrayList<Dish> getDishes() {
        return mDishes;
    }

    public void addDish(Dish dish) {
        mDishes.add(dish);
    }
}
