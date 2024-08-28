package com.sellers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellers.entity.User;

public interface HomeRepository  extends JpaRepository<User,Integer> {

	User findByUsername(String username);

}