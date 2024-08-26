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
	public boolean loginUser(User userVo) {
		try {
			User user=homeRepository.findByUsername(userVo.getUsername());
			if((user.getUsername().equals(userVo.getUsername())) && (user.getPassword().equals(userVo.getPassword()))) {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User saveUser(User user) {
		try {
			return homeRepository.save(user);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
