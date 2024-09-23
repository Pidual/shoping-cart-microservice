package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cart_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String articleName; // Nombre del artículo

    @Column(nullable = false)
    private Integer quantity; // Cantidad de artículos

    @Column(nullable = false)
    private Double price; // Precio del artículo

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private CartEntity cart; // Relación con la entidad Cart (clave foránea)
}
