package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.dto.Credentials;

@Configuration
@ConfigurationProperties("app.myapps")
@PropertySource("classpath:/credentials.properties")
public class CredConfig {

	 private Credentials credentials = new Credentials();
	//private Map<String, String> credentials = new HashMap<>();

	public Credentials getCredentials() {
		return credentials;
	}

	public String getCreds(String name) {
		System.out.println(getCredentials());
		return credentials.getUsername().equals(name) ? credentials.getUsername() : null;
		//return credentials.get("username").equals(name) ? credentials.get("username") : null;

	}
}
