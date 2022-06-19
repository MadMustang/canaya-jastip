package id.canaya.jastip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JastipApplication {

	@GetMapping("/")
	public String home() {
		return "Hello! Welcome to DANA Canaya Jastip API :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(JastipApplication.class, args);
	}

}
