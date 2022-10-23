package com.example.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		System.out.print("Run....................");
		SpringApplication.run(ProxyApplication.class, args);
	}

}
