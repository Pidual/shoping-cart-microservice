package com.emazon.shoppingcart_microservice.infraestructure.input;


import com.emazon.shoppingcart_microservice.application.dto.CartItemRequest;
import com.emazon.shoppingcart_microservice.application.handler.ICartHandler;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class ShoppingCartRestController {

    private final ICartHandler cartHandler;

    // Endpoint to add an item to the cart
    @PreAuthorize("hasRole('ROLE_CLIENT')")
    @PostMapping("/add")
    public ResponseEntity<Void> addItemToCart(@RequestBody CartItemRequest cartItemRequest, HttpServletRequest request ) {

        String token = request.getHeader("Authorization");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication != null ? authentication.getPrincipal().toString() : "unknown-user";

        cartHandler.addItemToCart(cartItemRequest,token, email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
