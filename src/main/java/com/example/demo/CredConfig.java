package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.dto.Credentials;

@Configuration
@PropertySource("classpath:/endpoint.properties")
public class CredConfig {

	private Credentials credentials = new Credentials();

	@Bean
	@ConfigurationProperties(prefix ="app.myapps.credentials")
	public Credentials credentials() {
		return credentials;
	}

	public String getCreds(String name) {
		System.out.println(credentials());
		return credentials().getUsername().equals(name) ? credentials().getUsername() : null;
	}
}
