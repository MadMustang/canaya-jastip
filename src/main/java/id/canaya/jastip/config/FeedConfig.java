/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package id.canaya.jastip.config;

import id.canaya.jastip.entity.FeedMessage;
import id.canaya.jastip.repository.FeedRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author Rionaldy "Roy" Triantoro (rionaldy.triantoro@dana.id)
 * @version $Id: FeedConfig.java, v 0.1 2022‐06‐21 14.18 Rionaldy "Roy" Triantoro Exp $$
 */
@Configuration
public class FeedConfig {

    @Bean
    CommandLineRunner feedDataInitializer(FeedRepository feedRepository) {
        return args -> {
            feedRepository.saveAll(Arrays.asList(
                    new FeedMessage(
                            "Angga Nugraha",
                            "Pada mau nitip apa di Singapore?",
                            LocalDate.parse("2022-07-11"),
                            "https://i.picsum.photos/id/101/2621/1747.jpg?hmac=cu15YGotS0gIYdBbR1he5NtBLZAAY6aIY5AbORRAngs"
                    ),
                    new FeedMessage(
                            "Angga Nugraha",
                            "Pada mau nitip apa di Singapore?",
                            LocalDate.parse("2022-07-11"),
                            "https://i.picsum.photos/id/101/2621/1747.jpg?hmac=cu15YGotS0gIYdBbR1he5NtBLZAAY6aIY5AbORRAngs"
                    )
            ));
        };
    }
}
