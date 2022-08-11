package com.example.taskB4.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_gdp")
public class CountryGDP {
	
	@Id
	private String gdp;
	@Column
	private String country;
	
	public String getGdp() {
		return gdp;
	}
	public void setGdp(String gdp) {
		this.gdp = gdp;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
