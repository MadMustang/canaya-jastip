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
                            "Korea",
                            "4,5",
                            "5 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Zaki-profile-pic_rZykbZfni.jpg"),
                    new User("Mangga Nugraha",
                            "Singapore",
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
                            "Japan",
                            "4,1",
                            "40 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Roy-profile-pic_Lg1gVyUbO.jpg"),
                    new User("Steven Sutana",
                            "Thailand",
                            "4,9",
                            "30 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Nenen-profile-pic_5EKsXPZVBO.jpg"),
                    new User("Roby Chandra",
                            "Indonesia",
                            "4,4",
                            "10 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/roby-profile-pic_zayfq4zcw.jpg"),
                    new User("Vince Iswara",
                            "Singapore",
                            "4,9",
                            "1 Hour Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/vince-profile-pic_s0LkNB83l.jpg?"),
                    new User("Norman Sasono",
                            "Malaysia",
                            "4,9",
                            "2 Minutes Ago",
                            1000000L,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/normal-profile-pic_XbOZnQuw0.jpg")
            ));
        };
    }
}
