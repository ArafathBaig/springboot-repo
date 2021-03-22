package com.practice.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable("from") String from,
			@PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity) {
		HashMap<String, String> uriVariables = new HashMap<>();
		
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		String uri = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
		ResponseEntity<CurrencyConversion> response = new RestTemplate().getForEntity(uri, CurrencyConversion.class, uriVariables);
		
		CurrencyConversion conversion = response.getBody();
		return new CurrencyConversion(conversion.getId(),
				from,to,
				quantity, 
				conversion.getConversionMultiple(), 
				quantity.multiply(conversion.getConversionMultiple()),
				conversion.getEnvironment());
	}
}
