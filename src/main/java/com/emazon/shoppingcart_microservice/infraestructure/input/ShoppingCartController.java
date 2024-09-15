package com.emazon.shoppingcart_microservice.infraestructure.input;

import com.emazon.shoppingcart_microservice.application.dto.ShoppingCartRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    private final IShoppingCartService shoppingCartService;

    public ShoppingCartController(IShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PreAuthorize("hasRole('CLIENT')")
    @PostMapping("/items")
    public ResponseEntity<Void> addItemToCart(@RequestBody ShoppingCartRequestDTO requestDTO) {

        shoppingCartService.addItemToCart(requestDTO);
        return ResponseEntity.ok().build();
    }




        // Otros endpoints
    }

    // Otros endpoints...
}
