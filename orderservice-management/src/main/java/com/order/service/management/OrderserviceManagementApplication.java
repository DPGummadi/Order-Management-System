package com.order.service.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @author Durga Prasad
 *
 */
@SpringBootApplication
@EnableFeignClients("com.order.service.management.feignclient")
public class OrderserviceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceManagementApplication.class, args);
	}

}
