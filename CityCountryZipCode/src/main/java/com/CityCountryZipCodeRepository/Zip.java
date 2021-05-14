package com.CityCountryZipCodeRepository;

public class Zip {

	String state;
	String city;
	String country;
	int zipcode;
	
	public Zip(String state, String city, String country, int zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	@Override
	public String toString() {
		return "Zip [zipcode=" + zipcode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	
}
