package com.sellers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellers.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
