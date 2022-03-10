package dev.jt.basicmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BasicmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicmissionApplication.class, args);
	}

}
