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
            productRepository.saveAll(Arrays.asList(
                    new Product(
                            "Net Carddas Gundam Duel Company [ 01 ] GN-DC01 (BOX)",
                            "\"now available from NetCard dass !! All Gundam participation! 66 types of mobile suit cards and 37 types of pilot cards are included! All mobile suit illustrations are drawn! The text on the back of the card is in Japanese and English. World specifications written together !! 6 levels of rarity with different designs and specifications !! Cards are placed in 3x3 squares to form 3 platoons. Master different weapons depending on the placement !! Two battle intervention elements that divide the victory and defeat !! \"\"Command ability\"\"\"",
                            1200000L,
                            LocalDate.parse("2022-06-20"),
                            LocalDate.parse("2022-07-01"),
                            3,
                            4L,
                            "Japan",
                            20,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_111_y-J11WLd8.png"
                    ),
                    new Product(
                            "Multivitamin Value 90 days DHC",
                            "\"Suplemen Jepang yang mengandung mineral esensial dan 13 vitamin berbeda, seperti : vitamin A, asam folat, kelompok vitamin B, vitamin C, E, D, P, untuk kehidupan sehari-hari Anda.\n" +
                                    "\n" +
                                    "Dosis  1 kapsul per hari\n" +
                                    "\n" +
                                    "Isi: 90 kapsul selama 90 hari\"",
                            180000L,
                            LocalDate.parse("2022-06-20"),
                            LocalDate.parse("2022-07-01"),
                            30,
                            4L,
                            "Japan",
                            100,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/DHC-multivitamin_Pd09UC-8_.png"
                    ),
                    new Product(
                            "Kit Kat Tokyo Banana",
                            "\"Tokyo Banana dan KITKAT.\n" +
                                    "\n" +
                                    "Membawa dua camilan besar bersama.\n" +
                                    "\n" +
                                    "Rasa pisang khas Tokyo Banana yang khas, diselimuti oleh cokelat KITKAT. Lembab, namun renyah. Pisang lucu diukir sebagai aksen.\"",
                            140000L,
                            LocalDate.parse("2022-06-20"),
                            LocalDate.parse("2022-07-01"),
                            10,
                            4L,
                            "Japan",
                            300,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/kit-kat-tokyo-banana_4ubsQdrWI.png"
                    ),
                    new Product(
                            "Kit Kat peach chocolate isi 11 mini",
                            "Kitkat rasa peach dan chocolate",
                            90000L,
                            LocalDate.parse("2022-06-20"),
                            LocalDate.parse("2022-07-01"),
                            10,
                            4L,
                            "Japan",
                            150,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/kit-kat-peach_KkGG52pG8.png"
                    ),
                    new Product(
                            "Kit Kat Dark Chocolate Japan",
                            "\"Kitkat Dark Chocolate Import From japan Langsung!\n" +
                                    "Exp masih tahun depan yahh!\n" +
                                    "Pengiriman Aman\"",
                            50000L,
                            LocalDate.parse("2022-06-20"),
                            LocalDate.parse("2022-07-01"),
                            10,
                            4L,
                            "Japan",
                            450,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/kit-kat-dark_nILX3uKBo.png"
                    ),
                    new Product(
                            "Garrett Popcorn Large Chicago Mix",
                            "Popcorn terkenal yang bikin kamu ketagihan dengan paduan rasa manis dari caramel crisp serta cheese corn yang asin dan gurih",
                            200000L,
                            LocalDate.parse("2022-06-24"),
                            LocalDate.parse("2022-07-05"),
                            10,
                            2L,
                            "Singapore",
                            600,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/garret-chicago_sqmCKWnYH.png"
                    ),
                    new Product(
                            "Garrett Popcorn Caramel Crisp",
                            "Popcorn terkenal yang bikin kamu ketagihan dengan rasa manis dari caramel crisp",
                            200000L,
                            LocalDate.parse("2022-06-24"),
                            LocalDate.parse("2022-07-05"),
                            10,
                            2L,
                            "Singapore",
                            600,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/garret-caramel_PfiMzTiKy.png"
                    ),
                    new Product(
                            "Garrett Popcorn Large Cheese Corn",
                            "Popcorn terkenal yang bikin kamu ketagihan dengan rasa cheese corn yang asin dan gurih",
                            200000L,
                            LocalDate.parse("2022-06-24"),
                            LocalDate.parse("2022-07-05"),
                            10,
                            2L,
                            "Singapore",
                            600,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/garret-cheese_t2Q1al4ON.png"
                    ),
                    new Product(
                            "Irvins Spicy Salted Egg Salmon Skin",
                            "Irvins Hot Boom /Spicy Salted Egg Salmon Skin varian 105gr , Fresh from SG Manufacturer, Expiry date Nov 2023",
                            145000L,
                            LocalDate.parse("2022-06-24"),
                            LocalDate.parse("2022-07-05"),
                            10,
                            2L,
                            "Singapore",
                            105,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/irvin-spicy-salted-egg_wou0UtCmh.png"
                    ),
                    new Product(
                            "Irvins Spicy Salted Cassava Chips",
                            "Irvins Hot Boom /Spicy Salted Egg Cassava Chips varian 125gr , Fresh from SG Manufacturer, Expiry date Nov 2023",
                            145000L,
                            LocalDate.parse("2022-06-24"),
                            LocalDate.parse("2022-07-05"),
                            10,
                            2L,
                            "Singapore",
                            105,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/irvin-casava_PHIWxM3q7.png"
                    ),
                    new Product(
                            "OFFICIAL LIGHTSTICK BTS ARMY BOMB SPECIAL EDITION",
                            "\"100% OFFICIAL BIGHIT ENTERTAINMENT...\n" +
                                    "BISA CONNECT BLUETOOTH...\n" +
                                    "BISA CONNECT WEVERSE... YOK ARMY BELI YOK\"",
                            750000L,
                            LocalDate.parse("2022-07-02"),
                            LocalDate.parse("2022-07-16"),
                            5,
                            1L,
                            "Korea",
                            1500,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/bts-light-stick_hffUOglW_.png"
                    ),
                    new Product(
                            "Nature Republic Mask Sheet Royal Jelly",
                            "Mask Sheet Langsung dari Korea",
                            12000L,
                            LocalDate.parse("2022-07-02"),
                            LocalDate.parse("2022-07-16"),
                            20,
                            1L,
                            "Korea",
                            50,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/mask-sheet-royal-jelly_Bx8KmrZ5B.png"
                    ),
                    new Product(
                            "Nature Republic Mask Sheet Avocado",
                            "Mask Sheet Langsung dari Korea",
                            12000L,
                            LocalDate.parse("2022-07-02"),
                            LocalDate.parse("2022-07-16"),
                            20,
                            1L,
                            "Korea",
                            50,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/mask-sheet-avocado_qCE8dNjP2.png"
                    ),
                    new Product(
                            "Nature Republic Mask Sheet Tea Tree",
                            "Mask Sheet Langsung dari Korea",
                            12000L,
                            LocalDate.parse("2022-07-02"),
                            LocalDate.parse("2022-07-16"),
                            20,
                            1L,
                            "Korea",
                            50,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/mask-sheet-tee-tree_y0IaE6P9c.png"
                    ),
                    new Product(
                            "Nature Republic Mask Sheet Aloe",
                            "Mask Sheet Langsung dari Korea",
                            12000L,
                            LocalDate.parse("2022-07-02"),
                            LocalDate.parse("2022-07-16"),
                            20,
                            1L,
                            "Korea",
                            50,
                            "https://ik.imagekit.io/aelous/canya-jastip-test/mask-sheet-aloe_Zz9bmiLSN.png"
                    )
            ));
        };
    }
}
