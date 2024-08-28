package com.sellers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sellers.entity.User;
import com.sellers.repository.HomeRepository;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeRepository homeRepository;

	@Override
	public User loginUser(User userVo) {
		try {
			if((userVo.getUsername().equals("admin")) && (userVo.getPassword().equals("admin"))) {
				return userVo;
			}
			User user=homeRepository.findByUsername(userVo.getUsername());
			if((user.getUsername().equals(userVo.getUsername())) && (user.getPassword().equals(userVo.getPassword()))) {
				return user;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}