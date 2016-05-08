package com.podgoreanu.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.podgoreanu.bo.AndroidMonitor;

@RestController
public class MoqupController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping(value = "/androidmonitor", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public AndroidMonitor showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new AndroidMonitor();
	}
}
