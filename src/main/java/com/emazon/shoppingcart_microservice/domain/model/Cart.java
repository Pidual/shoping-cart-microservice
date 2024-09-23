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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<CartItem> getArticleList() {
        return cartItemList;
    }

    public void setArticleList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }
}
