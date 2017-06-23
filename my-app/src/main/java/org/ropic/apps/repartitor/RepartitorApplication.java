package org.ropic.apps.repartitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@RequestMapping("/repo")
public class RepartitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepartitorApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String getHello() {
		return "Hello Spring!";
	}
}
