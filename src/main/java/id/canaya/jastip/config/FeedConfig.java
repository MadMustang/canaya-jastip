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
                            5L,
                            "Oy. Pada mau nitip ga? Gw lagi di Bangkok nih sampe tanggal 17.",
                            LocalDate.parse("2022-07-17"),
                            4
                    ),
                    new FeedMessage(
                            3L,
                            "Seneng-seneng di KL. Kalo ada yg mau nitip, monggo.",
                            LocalDate.parse("2022-07-16"),
                            1
                    ),
                    new FeedMessage(
                            1L,
                            "Pada mau nitip apa di Korea? Gw open PO nih. Jangan ngaret ye.",
                            LocalDate.parse("2022-07-16"),
                            2
                    ),
                    new FeedMessage(
                            2L,
                            "Lagi di Singapore nih sampe tgl 11. Ada yg mau request ga?",
                            LocalDate.parse("2022-07-11"),
                            5
                    ),
                    new FeedMessage(
                            4L,
                            "Mantap nih jalan-jalan di Tokyo. Ada yg mau nitip sesuatu ga?",
                            LocalDate.parse("2022-07-01"),
                            6
                    )
            ));
        };
    }
}
