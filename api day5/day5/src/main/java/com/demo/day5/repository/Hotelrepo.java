package com.demo.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.day5.model.Hotelmodel;

public interface Hotelrepo extends JpaRepository<Hotelmodel, Integer>{
	
}
