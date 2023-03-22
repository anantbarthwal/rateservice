package com.bookings.rateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RateserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateserviceApplication.class, args);
	}

}
