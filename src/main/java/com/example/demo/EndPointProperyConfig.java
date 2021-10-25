package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties("app.myapps")
@PropertySource("classpath:/endpoint.properties")
public class EndPointProperyConfig {

	private Map<String, String> endpoint = new HashMap<>();

	public Map<String, String> getEndPoint() {
		return endpoint;
	}

	public String getEndPoint(String appName) {

		System.out.println(getEndPoint());
		return endpoint.get(appName);
	}

}
