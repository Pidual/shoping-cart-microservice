package com.emazon.shoppingcart_microservice.domain.model;

public class CartItem {

    private String articleName;
    private int quantity;


    public CartItem(String articleName, int quantity, double price) {
        this.articleName = articleName;
        this.quantity = quantity;
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

}
