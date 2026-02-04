package pip.it.java.year3.staticvariable.convert;
//Java Course – Life University
//This class provides static methods to convert
//measurements between feet and inches.

/*
 * DimensionConverter
 * This class contains static variables and methods
 * used for unit conversion.
 */
public class DimensionConverter {
	
	// Constant variable 
	public static final int INCHES_PER_FOOT = 12;
	 //Converts feet to inches.
	 public static double convertFeetToInches (double feet)
	 {
	 return feet * INCHES_PER_FOOT;
	 }
	 //Converts inches to feet.
	 public static double convertInchesToFeet (double inches)
	 {
	 return inches / INCHES_PER_FOOT;
	 }

}
