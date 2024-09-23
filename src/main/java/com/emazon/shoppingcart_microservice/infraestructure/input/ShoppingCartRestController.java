package com.emazon.shoppingcart_microservice.infraestructure.input;


import com.emazon.shoppingcart_microservice.application.dto.CartItemRequest;
import com.emazon.shoppingcart_microservice.application.handler.ICartHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("/add")
    public ResponseEntity<Void> addItemToCart(@RequestBody CartItemRequest cartItemRequest) {
        cartHandler.addItemToCart(cartItemRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
