package com.emazon.shoppingcart_microservice.domain.usecase;

import com.emazon.shoppingcart_microservice.domain.api.ICartServicePort;
import com.emazon.shoppingcart_microservice.domain.model.Cart;
import com.emazon.shoppingcart_microservice.domain.model.CartItem;
import com.emazon.shoppingcart_microservice.domain.spi.ICartPersistencePort;

public class CartUseCase implements ICartServicePort {

    private final ICartPersistencePort cartJpaAdapter;

    public CartUseCase(ICartPersistencePort cartJpaAdapter){
        this.cartJpaAdapter = cartJpaAdapter;
    }

    //Agregar al carrito

    @Override
    public void addItemToCart(CartItem cartItem) {
        // Validar existencia del carrito para el usuario (crearlo si no existe)
        Cart cart = cartJpaAdapter.getCartByEmail("user@example.com"); // Extraer usuario de autenticación

        // Validar si el artículo ya existe en el carrito
        if (cart.hasItem(cartItem.getArticleName())) {
            // Actualizar la cantidad si el artículo ya está en el carrito
            cart.updateItemQuantity(cartItem.getArticleId(), cartItem.getQuantity());
        } else {
            // Agregar nuevo artículo al carrito
            cart.addItem(cartItem);
        }

        // Persistir los cambios
        cartPersistencePort.saveCart(cart);
    }



    //Eliminar del carrito


    //Consultar carrito

    //Comprar



}
