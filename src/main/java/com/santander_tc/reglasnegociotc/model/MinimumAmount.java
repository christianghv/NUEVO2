package com.santander_tc.reglasnegociotc.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MinimumAmount implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer amount;
	private java.lang.String currencycode;

	public MinimumAmount() {
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public java.lang.String getCurrencycode() {
		return this.currencycode;
	}

	public void setCurrency_code(java.lang.String currencycode) {
		this.currencycode = currencycode;
	}

	public minimum_amount(java.lang.Integer amount,
			java.lang.String currencycode) {
		this.amount = amount;
		this.currencycode = currency_code;
	}

}