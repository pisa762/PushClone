package edu.pip.java.oop.writingMethod;
//Java Course – Life University
//This class formats and displays a double value
//as a dollar amount.

/*
* DollarFormatFirstTry
* This class contains a method that converts a
* double value into a dollar format with two
* decimal places.
*/
public class DollarFormatFirstTry {
	public static void write (double amount)
	 {
		 // Convert the amount to cents and round to the nearest integer
	 int allCents = (int) (Math.round (amount * 100));
	// Calculate dollars and remaining cents
	 int dollars = allCents / 100;
	 int cents = allCents % 100;
	 System.out.print ('$');
	 System.out.print (dollars);
	 System.out.print ('.');
	// Ensure cents are displayed with two digits
	 if (cents < 10) {
	 System.out.print ('0');
	 System.out.print (cents);
	 } else
	 System.out.print (cents);
	 }

}
