package com.sellers.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Seller {

	private int id;
	private String name;
	private int rating;
	private String review;
}
