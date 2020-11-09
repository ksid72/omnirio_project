package com.accountdetails.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accountdetails.model.SignupRequest;

@FeignClient(name="user-security-service")
public interface UserServiceProxy {

	@RequestMapping("/api/auth/signup")
	public String createUser(@RequestBody  SignupRequest signupRequest);

}
