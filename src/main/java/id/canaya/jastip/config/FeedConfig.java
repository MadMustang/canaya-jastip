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
                            1L,
                            "Pada mau nitip apa di Singapore? Gw open PO nih.",
                            LocalDate.parse("2022-07-11")
                    ),
                    new FeedMessage(
                            2L,
                            "Lagi di Bangkok nih. Ada yg mau request?",
                            LocalDate.parse("2022-07-11")
                    ),
                    new FeedMessage(
                            4L,
                            "Mantap nih jalan-jalan di Ho Chi Minh. Ada yg mau nitip sesuatu ga?",
                            LocalDate.parse("2022-07-15")
                    ),
                    new FeedMessage(
                            3L,
                            "Seneng-seneng di KL. Kalo ada yg mau nitip, monggo.",
                            LocalDate.parse("2022-07-16")
                    ),
                    new FeedMessage(
                            5L,
                            "Oy. Pada mau nitip ga? Gw lagi di Manila.",
                            LocalDate.parse("2022-07-17")
                    )
            ));
        };
    }
}
