package com.CityCountryZipCodeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.CityCountryZipCodeRepository.Zip;
import com.CityCountryZipCodeService.ZipcodeService;

@Controller
public class ZipController {

	@Autowired
	ZipcodeService p;

	@GetMapping("/find/{pincode}")
	public Zip get(@PathVariable int zipcode) {
		System.out.println(zipcode);
		return p.getDetails(zipcode);	
	}
}
