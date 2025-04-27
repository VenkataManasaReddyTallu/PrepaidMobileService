package com.aits.mobileprepaid.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentDetails {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int upiId;
    private String cardNumber;
    private String bankAccount;
    private String method;
	public PaymentDetails() {
		super();
	}
	public PaymentDetails( int upiId, String cardNumber, String bankAccount,String method) {
		super();
		this.method = method;
		this.upiId = upiId;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public int getUpiId() {
		return upiId;
	}
	public void setUpiId(int upiId) {
		this.upiId = upiId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
    
}