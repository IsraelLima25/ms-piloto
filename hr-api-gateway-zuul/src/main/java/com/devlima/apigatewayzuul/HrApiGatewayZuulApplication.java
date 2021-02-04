package com.devlima.apigatewayzuul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class HrApiGatewayZuulApplication implements CommandLineRunner {
	
	@Value("${jwt.secret}")
	private String jwtSecret;

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("JWT_SECRET = " + jwtSecret);
	}

}
