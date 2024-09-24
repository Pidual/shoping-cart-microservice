package com.emazon.shoppingcart_microservice.domain.usecase;

import com.emazon.shoppingcart_microservice.domain.api.ICartServicePort;
import com.emazon.shoppingcart_microservice.domain.model.Cart;
import com.emazon.shoppingcart_microservice.domain.model.CartItem;
import com.emazon.shoppingcart_microservice.domain.spi.ICartPersistencePort;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Date;

public class CartUseCase implements ICartServicePort {

    private final ICartPersistencePort cartJpaAdapter;

    public CartUseCase(ICartPersistencePort cartJpaAdapter){
        this.cartJpaAdapter = cartJpaAdapter;
    }


    @Override
    public void addItemToCart(CartItem cartItem) {

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String token = request.getHeader("Authorization");

        if (token == null || !token.startsWith("Bearer ")) {
            throw new IllegalArgumentException("JWT token is missing or invalid");
        }
        // Strip the "Bearer " prefix to get the raw token
        token = token.substring(7);
        // Extract authentication for user information (optional)
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication != null ? authentication.getPrincipal().toString() : "unknown-user";

        System.out.println(email);
        // Ver si el carrito existe
        Cart cart = cartJpaAdapter.getCartByEmail(email);

        if (cart == null) {
            cart = new Cart(email, new, new Date(), new Date());
            cart.getCartItemList().add(cartItem);
        }else{
            // Verificar si el artículo ya está en el carrito
            CartItem existingItem = cart.getCartItemList()
                    .stream()
                    .filter(item -> item.getArticleName().equals(cartItem.getArticleName()))
                    .findFirst()
                    .orElse(null);

            if (existingItem != null) {
                // Si el artículo ya existe, actualizar la cantidad
                existingItem.setQuantity(existingItem.getQuantity() + cartItem.getQuantity());
            } else {
                // Si no existe, agregar el nuevo artículo
                cart.getCartItemList().add(cartItem);
            }
        }

        cart.setLastModificationDate(new Date());
        cartJpaAdapter.saveCart(cart);
    }

}
