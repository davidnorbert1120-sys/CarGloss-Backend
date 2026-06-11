package hu.cargloss.cargloss_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CarglossBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarglossBackendApplication.class, args);
	}

}
