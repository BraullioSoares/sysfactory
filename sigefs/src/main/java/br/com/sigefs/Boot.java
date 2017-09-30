package br.com.sigefs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Boot extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(Boot.class, args);
	}
}
