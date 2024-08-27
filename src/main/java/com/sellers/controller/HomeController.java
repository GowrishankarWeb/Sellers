package com.sellers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sellers.entity.Seller;
import com.sellers.entity.User;
import com.sellers.repository.SellerRepository;
import com.sellers.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user, BindingResult result){
		boolean loggedIn=false;
		try {
			loggedIn=homeService.loginUser(user);
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
	
	@GetMapping("/getAllSellers")
	public ResponseEntity<?> getAllSellers(){
		List<Seller> sellersList = new ArrayList<>();
		try {
			sellersList = sellerRepository.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("An error occured", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return ResponseEntity.ok(sellersList);
	}
	
	
}
