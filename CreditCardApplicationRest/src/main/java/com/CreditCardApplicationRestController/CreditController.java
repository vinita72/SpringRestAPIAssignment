package com.CreditCardApplicationRestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.CreditCardApplicationRestService.CreditService;

@Controller
public class CreditController {

	
	@Autowired
	CreditService card;

	@GetMapping("/card/{cardNo}")
	public String getCard(@PathVariable long cardNo) {
		return this.card.getCardType(cardNo);
	}
}
