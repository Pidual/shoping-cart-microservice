package com.emazon.shoppingcart_microservice.domain.api;

import com.emazon.shoppingcart_microservice.domain.model.CartItem;

public interface ICartServicePort {

    void addItemToCart(CartItem cartItem, String token, String email);
}
