/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.config;

import id.canaya.jastip.entity.ProductDO;
import id.canaya.jastip.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: ProductConfig.java, v 0.1 2022‐06‐21 11.18 Rionaldy "Roy" Triantoro Exp $$
 */
@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner productDataInitializer(ProductRepository productRepository) {
        return args -> {
            ProductDO shoe = new ProductDO(
                    "Adidas All-Star",
                    "Adidas shoes blyat",
                    10000.0,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11")
                    );
            ProductDO hat = new ProductDO(
                    "Adidas Hat",
                    "Adidas hat blyat",
                    10000.0,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11")
            );
            productRepository.saveAll(Arrays.asList(shoe, hat));
        };
    }
}