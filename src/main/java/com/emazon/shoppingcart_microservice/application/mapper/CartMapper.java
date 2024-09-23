package com.emazon.shoppingcart_microservice.application.mapper;

import com.emazon.shoppingcart_microservice.application.dto.CartItemRequest;
import com.emazon.shoppingcart_microservice.domain.model.CartItem;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CartMapper {

    CartItem toCartItem(CartItemRequest cartDTO);


}
