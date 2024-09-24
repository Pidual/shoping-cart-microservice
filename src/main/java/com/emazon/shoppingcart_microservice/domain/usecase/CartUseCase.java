package com.emazon.shoppingcart_microservice.domain.usecase;

import com.emazon.shoppingcart_microservice.domain.api.ICartServicePort;
import com.emazon.shoppingcart_microservice.domain.model.CartItem;
import com.emazon.shoppingcart_microservice.domain.spi.ICartPersistencePort;


public class CartUseCase implements ICartServicePort {

    private final ICartPersistencePort cartJpaAdapter;

    public CartUseCase(ICartPersistencePort cartJpaAdapter){
        this.cartJpaAdapter = cartJpaAdapter;
    }


    @Override
    public void addItemToCart(CartItem cartItem, String token, String email) {


    }
}
