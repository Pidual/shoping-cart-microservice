package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.mapper;


import com.emazon.shoppingcart_microservice.domain.model.Cart;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.entity.CartEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartEntityMapper {

    CartEntity toCartEntity(Cart cart);

    Cart toCart(CartEntity cartEntity);


}
