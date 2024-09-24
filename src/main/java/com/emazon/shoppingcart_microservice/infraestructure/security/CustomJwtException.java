package com.emazon.shoppingcart_microservice.infraestructure.security;

public class CustomJwtException extends RuntimeException {
    public CustomJwtException(String message) {
        super(message);
    }
}
