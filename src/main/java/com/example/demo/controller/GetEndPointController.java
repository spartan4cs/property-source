package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CredConfig;
import com.example.demo.EndPointProperyConfig;

@RestController
public class GetEndPointController {

	@Autowired
	EndPointProperyConfig endPointProperyConfig;

	@Autowired
	CredConfig credconfig;

	@GetMapping("/app/{appName}")
	public String getEndPoint(@PathVariable String appName) {

		return endPointProperyConfig.getEndPoint(appName);
	}

	@GetMapping("/app/creds/{creds}")
	public String getCreds(@PathVariable String creds) {

		return credconfig.getCreds(creds);
	}
}
