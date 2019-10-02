package edu.osu.cse5234.model;

public class PaymentInfo implements java.io.Serializable {
	
	String expDate;
	String cvvCode;
	String cardholderName;
	
	public PaymentInfo() {
		
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	
}
