package com.CityCountryZipCodeService;

import java.util.ArrayList;
import java.util.List;

import com.CityCountryZipCodeRepository.Zip;

public class ZipcodeServiceImpl implements ZipcodeService{

	
	List<Zip> zip;

	public void ZipcodeService() {
		zip = new ArrayList<>();
		zip.add(new Zip("xyz state","abc city","Country1", 302322));
		zip.add(new Zip("xyz state","abc city","Country1", 5345454));
		zip.add(new Zip("xyz state","abc city","Country1", 5345345));
		zip.add(new Zip("xyz state","abc city","Country1", 459434));
		zip.add(new Zip("xyz state","abc city","Country1", 534950));
		zip.add(new Zip("xyz state","abc city","Country1", 459450));
		zip.add(new Zip("xyz state","abc city","Country1", 354534));
		zip.add(new Zip("xyz state","abc city","Country1", 53453));
		zip.add(new Zip("xyz state","abc city","Country1", 534534));
		zip.add(new Zip("xyz state","abc city","Country1", 453453));
		zip.add(new Zip("xyz state","abc city","Country1", 534545));
		zip.add(new Zip("xyz state","abc city","Country1", 302322));
		zip.add(new Zip("xyz state","abc city","Country1", 345445));
		zip.add(new Zip("xyz state","abc city","Country1", 5345344));
		zip.add(new Zip("xyz state","abc city","Country1", 5435353));


	}
	
	public Zip getDetails(int zipcode) {
		for(Zip z : zip)
			{
			if(z.getZipcode()==zipcode)
				{
				System.out.println(z);
			    return z;
			    }
			}
		return null;
}
}
