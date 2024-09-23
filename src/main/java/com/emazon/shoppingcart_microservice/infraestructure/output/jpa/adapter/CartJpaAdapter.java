package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.adapter;

import com.emazon.shoppingcart_microservice.domain.model.Cart;
import com.emazon.shoppingcart_microservice.domain.spi.ICartPersistencePort;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.mapper.CartEntityMapper;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.repository.ICartRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CartJpaAdapter implements ICartPersistencePort {

    private final ICartRepository cartRepository;
    private final CartEntityMapper cartEntityMapper;



    @Override
    public Cart getCartByEmail(String mail) {
        return null;
    }
}
