package com.rpl.klmpk2.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@RequestMapping("/") // Baris ini memetakan URI path yang akses pengguna
	public String home() {
		return "index";
	}

}
