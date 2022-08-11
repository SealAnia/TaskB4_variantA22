package com.example.taskB4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.taskB4.dto.CountryGDPDto;
import com.example.taskB4.model.entity.CountryGDP;
import com.example.taskB4.model.repository.CountryGDPRepository;
import com.example.taskB4.service.CountryGDPService;

@Service
public class CountryGDPServiceImpl implements CountryGDPService {
	
	private final CountryGDPRepository countryGDPRepository;
	
	@Autowired
	public CountryGDPServiceImpl(CountryGDPRepository countryGDPRepository) {
		this.countryGDPRepository = countryGDPRepository;
	}

	@Override
	public List<CountryGDP> getAll() {
		List<CountryGDP> countries = countryGDPRepository.findAll(Sort.by(Direction.ASC, "country"));
		
		return countries;
	}
	
	public CountryGDP update(CountryGDP countryGDP, CountryGDPDto countryGDPDto) {
		String regex = "/\\[.*?\\]/s";
		countryGDP = countryGDPRepository.getById(countryGDP.getGdp());
		countryGDP.setCountry(countryGDP.getCountry().replace(regex, " "));
		return countryGDPRepository.saveAndFlush(countryGDP);
	}

}
