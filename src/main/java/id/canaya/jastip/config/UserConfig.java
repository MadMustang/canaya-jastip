/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.config;

import id.canaya.jastip.entity.User;
import id.canaya.jastip.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: UserConfig.java, v 0.1 2022‐06‐21 15.12 Rionaldy "Roy" Triantoro Exp $$
 */
@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner userDataInitializer(UserRepository userRepository) {
        return args -> {
            User alan = new User("Alan Wake", 1000000.0);
            User jacob = new User("Little Jacob", 1000000.0);
            userRepository.saveAll(Arrays.asList(alan, jacob));
        };
    }
}
