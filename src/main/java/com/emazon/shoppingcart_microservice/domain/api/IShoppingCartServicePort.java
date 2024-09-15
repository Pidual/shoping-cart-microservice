package com.emazon.shoppingcart_microservice.domain.api;

import com.emazon.shoppingcart_microservice.domain.model.ShoppingCart;

public interface IShoppingCartServicePort {

    void addToCart(ShoppingCart cart);
    void removeFromCart(ShoppingCart cart);
    void getCart(ShoppingCart cart); //todo: change this shit nigga
}
