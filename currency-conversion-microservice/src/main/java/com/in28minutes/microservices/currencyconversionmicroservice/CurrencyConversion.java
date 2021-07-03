package com.in28minutes.microservices.currencyconversionmicroservice;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal tatalCalculatedAmount;
	private String environment;
	public CurrencyConversion(Long id, String from, String to,BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal tatalCalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.tatalCalculatedAmount = tatalCalculatedAmount;
		this.environment = environment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTatalCalculatedAmount() {
		return tatalCalculatedAmount;
	}
	public void setTatalCalculatedAmount(BigDecimal tatalCalculatedAmount) {
		this.tatalCalculatedAmount = tatalCalculatedAmount;
	}
	public String getEnvironment() {
		return environment;
	}
	public CurrencyConversion() {
		super();
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
