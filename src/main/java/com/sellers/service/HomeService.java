package com.sellers.service;

import com.sellers.entity.UserVo;

public interface HomeService {

	boolean loginUser(UserVo userVo);

	UserVo saveUser(UserVo userVo);

}
