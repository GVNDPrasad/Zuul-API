package com.api.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApiApplication {
    
	private static final Logger log = LoggerFactory.getLogger(ZuulApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiApplication.class, args);
		log.debug("DEBUG mode @ Started Zuul API Gateway");
		log.info("INFO mode @ Started Zuul API Gateway :: By default logger is INFO");
		log.warn("WARN mode @ Started Zuul API Gateway");
		log.error("ERROR mode @ Started Zuul API Gateway");
		System.out.println("ZuulApiApplication :: main() ::: Started Zuul API Gateway");
	}

}
