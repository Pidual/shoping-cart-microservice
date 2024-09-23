package com.emazon.shoppingcart_microservice.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemRequest {
    private Long articleName; // ID of the article to be added
    private Integer quantity; // Quantity of the article
}
