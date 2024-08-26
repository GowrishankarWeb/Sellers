package com.sellers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sellers.entity.UserVo;
import com.sellers.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserVo userVo, BindingResult result){
		boolean loggedIn=false;
		try {
			loggedIn=homeService.loginUser(userVo);
			if(loggedIn) {
				return new ResponseEntity<String>("Logged In Successfully", HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("Invalid username or password", HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("An error occured", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<Integer> createUser(@RequestBody UserVo userVo, BindingResult result){
		UserVo userInserted=null;
		try {
			userInserted=homeService.saveUser(userVo);
			if(userInserted.getId()>0) {
				return new ResponseEntity<Integer>(userInserted.getId(), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Integer>(0, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Integer>(-1, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
	
	
}
