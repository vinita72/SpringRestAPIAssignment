package com.CityCountryZipCodeService;

import org.springframework.stereotype.Service;

import com.CityCountryZipCodeRepository.Zip;

@Service
public interface ZipcodeService {

	public Zip getDetails(int zipcode);

}
