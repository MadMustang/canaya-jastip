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
            userRepository.saveAll(Arrays.asList(
                    new User("Zaki Muhammad",
                            "Singapore",
                            "4.5",
                            "10 Minutes Ago",
                            1000000L,
                            "https://i.picsum.photos/id/1009/5000/7502.jpg?hmac=Uj6crVILzsKbyZreBjHuMiaq_-n30qoHjqP0i7r30r8"),
                    new User("Angga Nugraha",
                            "Singapore",
                            "4.5",
                            "10 Minutes Ago",
                            1000000L,
                            "https://i.picsum.photos/id/101/2621/1747.jpg?hmac=cu15YGotS0gIYdBbR1he5NtBLZAAY6aIY5AbORRAngs")
            ));
        };
    }
}
