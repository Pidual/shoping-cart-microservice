package com.emazon.shoppingcart_microservice.application.handler;


import com.emazon.shoppingcart_microservice.application.dto.CartItemRequest;
import com.emazon.shoppingcart_microservice.application.mapper.CartMapper;
import com.emazon.shoppingcart_microservice.domain.api.ICartServicePort;
import com.emazon.shoppingcart_microservice.domain.model.CartItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartHandler implements ICartHandler {


    private final ICartServicePort cartUseCase;
    private final CartMapper cartMapper;


    @Override
    public void addItemToCart(CartItemRequest cartItemRequest) {
        cartUseCase.addItemToCart(cartMapper.toCartItem(cartItemRequest));
    }

}

