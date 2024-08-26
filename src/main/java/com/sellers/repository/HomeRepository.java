package com.sellers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellers.entity.UserVo;

public interface HomeRepository  extends JpaRepository<UserVo,Integer> {

	UserVo findByUsername(String username);

}
