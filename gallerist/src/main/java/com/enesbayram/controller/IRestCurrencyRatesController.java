package com.enesbayram.controller;

import com.enesbayram.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate , String endDate);
}
