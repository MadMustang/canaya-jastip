/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.config;

import id.canaya.jastip.entity.Product;
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
            Product shoe = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    100000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_113_D9ybago45.png"
                    );
            Product hat = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    20000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_117_CX6JGEyf2.png"
            );
            Product socks = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product shirt = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product boxer = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product something = new Product(
                    "Lorem",
                    "Lorem ipsum dolor si amet",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    2166100000000L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_108_AxIumJ9oS.png"
            );
            productRepository.saveAll(Arrays.asList(hat, shoe, socks, shirt, boxer));
        };
    }
}
