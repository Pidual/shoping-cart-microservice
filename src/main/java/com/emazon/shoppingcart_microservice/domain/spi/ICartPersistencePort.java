package com.emazon.shoppingcart_microservice.domain.spi;

import com.emazon.shoppingcart_microservice.domain.model.Cart;

public interface ICartPersistencePort {

    Cart getCartByEmail(String mail);
}
