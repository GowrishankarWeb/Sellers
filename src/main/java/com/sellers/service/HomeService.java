package com.sellers.service;

import com.sellers.entity.User;

public interface HomeService {

	boolean loginUser(User userVo);

	User saveUser(User userVo);

}
