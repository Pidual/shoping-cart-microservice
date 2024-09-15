package com.emazon.shoppingcart_microservice.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 *  PK UniqueID
 *  id articulo
 *  id usuario
 *  cantidad
 *  fecha actualizacion
 *  fecha creacion
 */
public class ShoppingCart {


    private String customerId; // or customerEmail
    private List<CartItem> items = new ArrayList<>();
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;


    public ShoppingCart(LocalDateTime lastModifiedDate, List<CartItem> items, String customerId) {
        this.lastModifiedDate = lastModifiedDate;
        this.items = items;
        this.customerId = customerId;
    }

    // Constructores, getters y setters
}