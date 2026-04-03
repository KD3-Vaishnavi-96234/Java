package com.sunbeam.invoice;

public class Invoice {

	String partNumber;
	String partDescriptiion;
	int qty;
	double price;

	public Invoice(String partNumber, String partDescriptiion, int qty, double price) {
		setPartNumber(partNumber);
		setPartDescriptiion(partDescriptiion);
		setQty(qty);
		setPrice(price);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescriptiion() {
		return partDescriptiion;
	}

	public void setPartDescriptiion(String partDescriptiion) {
		this.partDescriptiion = partDescriptiion;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			this.qty = 0;
			System.out.println("Enter quantity greater than zero.");
		} else
			this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0.0;
			System.out.println("Enter priceS greater than zero.");
		} else
			this.price = price;
	}

	public Double calulateInvoiceAmount() {
		double totalPrice = price * qty;
		return totalPrice;
	}
}
