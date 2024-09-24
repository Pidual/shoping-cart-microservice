package com.emazon.shoppingcart_microservice.application.handler;

import com.emazon.shoppingcart_microservice.application.dto.CartItemRequest;

public interface ICartHandler {

    void addItemToCart(CartItemRequest cartItemRequest, String token, String email);


}
