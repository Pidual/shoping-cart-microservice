package com.emazon.shoppingcart_microservice.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemRequest {
    private String articleName;
    private Integer quantity;
}
