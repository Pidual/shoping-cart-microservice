package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unique_id")
    private Long uniqueId;

    @Column(name = "id_articulo", nullable = false)
    private Long idArticulo;  // Relación con el microservicio de stock (artículos)

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;  // Relación con el microservicio de usuarios

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;  // Cantidad del artículo en el carrito

    @Column(name = "fecha_actualizacion", nullable = false)
    private LocalDateTime fechaActualizacion;  // Fecha de la última actualización del carrito

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;  // Fecha de creación del carrito

    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.fechaActualizacion = LocalDateTime.now();
    }



}
