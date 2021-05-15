package com.CalculatorRestApiSpring.CalculatorRestApiSpringScientific;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CalculatorRestApiSpring.CalculatorRestApiSpringmodel.ApiResult;


@RestController
@RequestMapping("/scientific")
public class ScientificController {

   private final ScientificController _scientificController;

   public ScientificController( ScientificController scientificController) {
	   _scientificController = scientificController;
   }

   @GetMapping("/square/{factor}")
   public ApiResult square(@PathVariable BigDecimal factor ) {
      return getResult(factor.multiply(factor));
   }

   @GetMapping("/factorial/{number}")
   public ApiResult factorial(@PathVariable int number ) {
      try {
         ApiResult factorial = _scientificController.factorial(number);
         return getResult(factorial);
      }
      catch ( ArithmeticException e ) {
         return getResultFromError(e.getMessage());
      }
   }

   @GetMapping("/prime/{number}")
   public ApiResult prime(@PathVariable long number ) {
      return getResult(_scientificController.isPrime(number));
   }
}
