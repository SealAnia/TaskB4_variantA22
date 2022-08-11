package com.example.taskB4.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskB4.model.entity.CountryGDP;

@Repository
public interface CountryGDPRepository extends JpaRepository<CountryGDP, String> {
	
}
