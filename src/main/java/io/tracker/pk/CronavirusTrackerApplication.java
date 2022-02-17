package io.tracker.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronavirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronavirusTrackerApplication.class, args);
	}

}
