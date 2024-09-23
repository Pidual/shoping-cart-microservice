package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userEmail; // Correo electrónico del usuario propietario del carrito

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime creationDate; // Fecha de creación del carrito

    @UpdateTimestamp
    private LocalDateTime lastModifiedDate; // Fecha de última modificación

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItemEntity> items; // Lista de artículos en el carrito
}