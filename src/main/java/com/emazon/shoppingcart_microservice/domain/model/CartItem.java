package com.emazon.shoppingcart_microservice.domain.model;

public class CartItem {

    private String articleName;
    private int quantity;
    private double price;


    public CartItem(String articleName, int quantity, double price) {
        this.articleName = articleName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
