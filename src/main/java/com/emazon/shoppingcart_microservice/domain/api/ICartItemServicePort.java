package com.emazon.shoppingcart_microservice.domain.api;

import com.emazon.shoppingcart_microservice.domain.model.CartItem;

public interface ICartItemServicePort {

    CartItem getCartItem(Long id);
    CartItem saveCartItem(CartItem cartItem);
    void deleteCartItem(CartItem cartItem);


}
