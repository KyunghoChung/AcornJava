package com.acorn.TeamProject.service;

import com.acorn.TeamProject.model.CartItem;
import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }
    public void clearCart(){
        items.clear();
    }
}