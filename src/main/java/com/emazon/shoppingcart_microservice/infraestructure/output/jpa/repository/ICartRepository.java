package com.emazon.shoppingcart_microservice.infraestructure.output.jpa.repository;

import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<CartEntity,Long> {

    CartEntity findCartEntityByUserEmail(String userMail);

}
