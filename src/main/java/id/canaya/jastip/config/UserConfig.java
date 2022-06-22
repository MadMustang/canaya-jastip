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
                            "4,5",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Zaki-profile-pic_rZykbZfni.jpg"),
                    new User("Angga Nugraha",
                            "Bangkok",
                            "4,5",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Angga-profile-pic_k99DYBmx0.jpg"),
                    new User("Thomi Jasir",
                            "Malaysia",
                            "4,9",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Thomi-profile-pic__GtCPZ6NmW.jpg"),
                    new User("Roy Triantoro",
                            "Vietnam",
                            "4,1",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Roy-profile-pic_Lg1gVyUbO.jpg"),
                    new User("Steven Sutana",
                            "Philippines",
                            "4,1",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Nenen-profile-pic_5EKsXPZVBO.jpg")
            ));
        };
    }
}
