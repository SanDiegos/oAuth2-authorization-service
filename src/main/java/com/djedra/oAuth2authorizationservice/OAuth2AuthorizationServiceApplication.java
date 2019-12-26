package com.djedra.oAuth2authorizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class OAuth2AuthorizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2AuthorizationServiceApplication.class, args);
	}

}
