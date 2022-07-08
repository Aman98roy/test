package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppServiceController {
	
	
	/*
	 * 
	 * こんにちはアマンはここにようこそ
	 */
	@GetMapping(value = "/")
	public String getHomePage() {
		System.out.println("AMAN");
		return "Welcome to Azure App Service Aman";
	}
	
	@GetMapping("/aman")
	public String getRoute() {
		return "Testing route";
	}

}
