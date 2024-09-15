package com.emazon.shoppingcart_microservice.domain.model;

/**
 * Representa cada artículo agregado al carrito junto con la cantidad deseada.
 * Atributos:
 *      id: Identificador único del elemento del carrito.
 *      articleId: Identificador del artículo (producto).
 *      quantity: Cantidad deseada del artículo.
 *      categoryId: Identificador de la categoría del artículo (para validar el límite por categoría).
 */
public class CartItem {

    private Long id;
    private Long articleId;
    private int quantity;
    private Long categoryId;

    // Constructores, getters y setters
}
