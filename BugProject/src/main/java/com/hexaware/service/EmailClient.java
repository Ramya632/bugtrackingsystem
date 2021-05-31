package com.hexaware.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.entity.BugRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(name="email-service")
public interface EmailClient {
	
	@PostMapping("/email")
	void sendEmail(@RequestBody BugRequest bug);
}
