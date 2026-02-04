package edu.pip.java.oop.writingMethod;
import java.util.Scanner;

//Java Course – Life University
//This program tests the DollarFormatFirstTry.write method.

/*
* DollarFormatFirstTryDriver
* This class contains the main method.
* It repeatedly accepts user input and
* displays the value in dollar format.
*/

public class DollarFormatFirstTryDriver {

	public static void main (String [] args)
	 {
	 double amount;
	 String response;
	 Scanner keyboard = new Scanner (System.in);
	 System.out.println ("Testing DollarFormatFirstTry.write:");
	// Loop to allow repeated testing
	 do {
	 System.out.println ("Enter a value of type double:");
	// Loop to allow repeated testing
	 amount = keyboard.nextDouble ();
	 DollarFormatFirstTry.write (amount);
	 System.out.println ();
	 System.out.println ("Test again?");
	 response = keyboard.next ();
	 }
	 while (response.equalsIgnoreCase ("yes"));
	 System.out.println ("End of test.");
	 }


}
/*
 * This program demonstrates:
 * - Writing and calling a static method
 * - Formatting monetary values
 * - User input using Scanner
 * - Repetition using a do-while loop
 */