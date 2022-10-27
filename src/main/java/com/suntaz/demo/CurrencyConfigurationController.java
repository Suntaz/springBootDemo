package com.suntaz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired CurrencyServiceConfiguration configuration;
	
	@RequestMapping("currency-configuration")
	public CurrencyServiceConfiguration getAllCurrencyConfiguration(){
		return configuration;
	}

}
