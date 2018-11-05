package com.example.demo;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingDemoApplication.class, args);

Logger rootLog = (Logger) LoggerFactory.getLogger("someCategory");
	}
}
