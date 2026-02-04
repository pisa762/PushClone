package pip.it.java.year3.staticvariable.convert;
import java.util.Scanner;
// Java Course – Life University
//This program demonstrates the use of static methods
//for converting measurements.

/*
* DimensionConverterDemo
* This class contains the main method.
* It takes user input and uses the static methods
* from DimensionConverter to perform conversions.
*/
public class DimensionConverterDemo {

	public static void main (String [] args)
	 {
	 Scanner keyboard = new Scanner (System.in);
	 System.out.println ("Enter a measurement in inches: ");
	 double inches = keyboard.nextDouble ();
	 
	// Convert inches to feet using static method
	 double feet = DimensionConverter.convertInchesToFeet (inches);
	 System.out.println (inches + " inches = " + feet + " feet.");
	 System.out.print ("Enter a measurement in feet: ");
	 feet = keyboard.nextDouble ();
	 
	// Convert feet to inches using static method
	 inches = DimensionConverter.convertFeetToInches (feet);
	 System.out.println (feet + " feet = " + inches + " inches.");
	 }
	}
/*
 * This program demonstrates:
 * - Use of static variables
 * - Use of static methods
 * - User input with Scanner
 * - Basic mathematical conversions
 */