package com.emazon.shoppingcart_microservice.domain.exceptions;

public class CartNotFound extends RuntimeException {
    public CartNotFound(String message) {
        super(message);
    }
}
