package com.CreditCardApplicationRestService;

import org.springframework.stereotype.Service;

@Service
public interface CreditService {

	String getCardType(long cardNo);
}
