package com.sunbeam.invoice;

public class InvoiceTest {

	public static void main(String[] args) {
	
		Invoice invoice = new Invoice("101", "Computer", 5, 40000.0);
		Double invoiceAmount = invoice.calulateInvoiceAmount();
		System.out.println("Total Amount is : ₹"+invoiceAmount);
		
		

	}

}
