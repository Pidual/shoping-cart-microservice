package com.emazon.shoppingcart_microservice.infraestructure.configuration;

import com.emazon.shoppingcart_microservice.domain.api.ICartServicePort;
import com.emazon.shoppingcart_microservice.domain.spi.ICartPersistencePort;
import com.emazon.shoppingcart_microservice.domain.usecase.CartUseCase;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.adapter.CartJpaAdapter;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.mapper.CartEntityMapper;
import com.emazon.shoppingcart_microservice.infraestructure.output.jpa.repository.ICartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICartRepository cartRepository;
    private final CartEntityMapper cartEntityMapper;

    @Bean
    public ICartServicePort cartServicePort() {
        return new CartUseCase(cartPersistencePort());
    }

    @Bean
    public ICartPersistencePort cartPersistencePort() {
        return new CartJpaAdapter(cartRepository, cartEntityMapper);
    }

}
