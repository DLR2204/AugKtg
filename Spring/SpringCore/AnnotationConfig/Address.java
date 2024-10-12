package com;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int hno;
	
	private String colony;
	
	private String city;
	
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", city=" + city + ", country=" + country + "]";
	}

	public Address(int hno, String colony, String city, String country) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.city = city;
		this.country = country;
	}
	
	

}
