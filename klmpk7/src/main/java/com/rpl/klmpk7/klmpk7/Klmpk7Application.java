package com.rpl.klmpk7.klmpk7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Klmpk7Application {

	public static void main(String[] args) {
		SpringApplication.run(Klmpk7Application.class, args);
	}

	@RequestMapping("/") // Baris ini memetakan URI path yang akses pengguna
	public String home() {
		return "index";
	}

}
