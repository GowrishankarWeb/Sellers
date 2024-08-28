package com.sellers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sellers.entity.Seller;
import com.sellers.entity.User;
import com.sellers.repository.SellerRepository;
import com.sellers.service.HomeService;

@RestController
@CrossOrigin(origins="http://localhost:5000/")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody User user, BindingResult result){
		User loggedInUser=null;
		try {
			loggedInUser=homeService.loginUser(user);
			if(loggedInUser!=null) {
				return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
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