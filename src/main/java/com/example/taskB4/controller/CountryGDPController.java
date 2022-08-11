package com.example.taskB4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.taskB4.dto.CountryGDPDto;
import com.example.taskB4.service.impl.CountryGDPServiceImpl;

@Controller
public class CountryGDPController {
	
	private final CountryGDPServiceImpl countryGDPService;
	
	@Autowired
	public CountryGDPController(CountryGDPServiceImpl countryGDPService) {
		this.countryGDPService = countryGDPService;
	}
	
	@GetMapping(value = "/country_gdp")
	public String getCountryAndGDP(Model model, CountryGDPDto countryGDPDdto) {
		var countries = countryGDPService.getAll();
		
		for(var country : countries) {
			countryGDPService.update(country, countryGDPDdto);
		}
		
		model.addAttribute("countries", countries);
		return "NewFile";
	}

}
