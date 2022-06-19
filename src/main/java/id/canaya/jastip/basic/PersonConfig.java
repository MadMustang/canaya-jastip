package id.canaya.jastip.basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            Person jacob = new Person("Little Jacob");
            Person alice = new Person("Alie Stuart");
            personRepository.saveAll(Arrays.asList(jacob, alice));
        };
    }
}
