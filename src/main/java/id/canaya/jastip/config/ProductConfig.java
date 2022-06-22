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
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    100000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_113_D9ybago45.png"
                    );
            Product hat = new Product(
                    "Lorem",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    20000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_117_CX6JGEyf2.png"
            );
            Product socks = new Product(
                    "Lorem",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product shirt = new Product(
                    "Lorem",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product boxer = new Product(
                    "Lorem",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_116_7B1j_n3O8.png"
            );
            Product something = new Product(
                    "Lorem",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id leo in vitae turpis massa sed elementum. Quisque egestas diam in arcu. Ut venenatis tellus in metus vulputate eu scelerisque. Cursus turpis massa tincidunt dui ut ornare. Proin libero nunc consequat interdum. Imperdiet nulla malesuada pellentesque elit eget gravida. Enim blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum posuere urna nec tincidunt. Vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Eu facilisis sed odio morbi quis.\n" +
                            "\n" +
                            "Nunc mi ipsum faucibus vitae aliquet. Sed elementum tempus egestas sed sed risus. Dictumst vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt. Morbi non arcu risus quis varius quam quisque. Ut tortor pretium viverra suspendisse. Risus nullam eget felis eget nunc lobortis. Aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis. Hendrerit dolor magna eget est lorem ipsum dolor sit amet. Aliquam eleifend mi in nulla posuere sollicitudin. Eu sem integer vitae justo eget magna. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Amet purus gravida quis blandit turpis cursus in hac. Nam at lectus urna duis convallis convallis tellus id interdum.\n" +
                            "\n" +
                            "Tellus orci ac auctor augue mauris augue neque gravida in. Ut tristique et egestas quis ipsum suspendisse ultrices gravida dictum. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Sit amet aliquam id diam. Viverra nibh cras pulvinar mattis nunc sed blandit libero volutpat. Sagittis vitae et leo duis ut diam. Quis auctor elit sed vulputate. Tincidunt vitae semper quis lectus nulla at volutpat diam ut. Scelerisque purus semper eget duis at tellus. Fringilla urna porttitor rhoncus dolor purus. Tristique nulla aliquet enim tortor at auctor urna. Volutpat consequat mauris nunc congue.",
                    4000000L,
                    LocalDate.parse("2022-07-07"),
                    LocalDate.parse("2022-07-11"),
                    5,
                    1L,
                    "Singapore",
                    "https://ik.imagekit.io/aelous/canya-jastip-test/Frame_108_AxIumJ9oS.png"
            );
            productRepository.saveAll(Arrays.asList(hat, shoe, socks, shirt, boxer, something));
        };
    }
}
