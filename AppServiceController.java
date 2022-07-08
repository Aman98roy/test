package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppServiceController {
	
	
	/*
	 * 昨日、私の家族は東京から新幹線に乗って富士山を見た。
		明日、三人の地質学者は休火山に行って古い石を集める。
		毎朝お茶を飲む。
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
