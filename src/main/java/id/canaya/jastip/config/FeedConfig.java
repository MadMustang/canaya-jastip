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
            FeedMessage fm1 = new FeedMessage(
                    "Alan Wake",
                    "Anyone wanna smoke? I'll be bringin back some Cuban if anyone is asking",
                    LocalDate.parse("2022-07-11")
            );
            FeedMessage fm2 = new FeedMessage(
                    "Little Jacob",
                    "Yo gwaan. Imma coming back bringing weed. Seen?",
                    LocalDate.parse("2022-07-11")
            );
            feedRepository.saveAll(Arrays.asList(fm1, fm2));
        };
    }
}
