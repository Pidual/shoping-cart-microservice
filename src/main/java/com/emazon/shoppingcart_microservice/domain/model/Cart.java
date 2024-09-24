package com.emazon.shoppingcart_microservice.domain.model;

import java.util.Date;
import java.util.List;

public class Cart {

    private String clientName;
    private List<CartItem> cartItemList;
    private Date createdAt;
    private Date lastModificationDate;


    public Cart(String clientName, List<CartItem> cartItemList, Date createdAt, Date lastModificationDate) {
        this.clientName = clientName;
        this.cartItemList = cartItemList;
        this.createdAt = createdAt;
        this.lastModificationDate = lastModificationDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }
}

