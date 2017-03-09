package io.tronbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DataConciergeEurekaServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DataConciergeEurekaServiceApplication.class, args);
	}
}
