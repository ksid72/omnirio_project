package com.accountdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountdetails.client.UserServiceProxy;
import com.accountdetails.model.SignupRequest;
import com.accountdetails.model.User;

import com.accountdetails.vo.UserVO;


@RestController
public class UserController {

//	@Autowired
//	UserService UserService;
	
	@Autowired
	UserServiceProxy userServiceProxy;
	

	@PostMapping(value = "/User", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> saveUserDetails(@RequestBody SignupRequest signupRequest) {

		String result=userServiceProxy.createUser(signupRequest);

		return new ResponseEntity(result, HttpStatus.CREATED);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@GetMapping(value = "/User", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<User> getUserDetails() {
//
//		
//		
//		//User User = UserService.getUserDetails();
//		
//		return new ResponseEntity(User, HttpStatus.OK);
//		
//	}
//	
	

//	@PutMapping(value = "/User", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<User> modifyUserDetails(@RequestBody UserVO UserVO) {
//	
//		
//		User User = UserService.modifyUserDetails(UserVO);
//		
//		return new ResponseEntity(User, HttpStatus.ACCEPTED);
//		
//	}

}
