package com.ecommerceproj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "";
	}

	@RequestMapping("/shop")
	public String shop() {
		return "shop";
	}

	@RequestMapping("/contact")
	public String defectDetails() {
		return "contact";
	}

}
