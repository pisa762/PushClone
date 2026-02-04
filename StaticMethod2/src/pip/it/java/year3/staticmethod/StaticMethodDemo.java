package pip.it.java.year3.staticmethod;
// Java Course – Life University
//This class demonstrates the difference
//between instance methods and static methods.

/*
* StaticMethodDemo
* This class contains both instance variables
* and methods to show how static and non-static
* methods behave in Java.
*/
public class StaticMethodDemo {
	
	// Instance variables (belong to the object)
	private int att1, att2;
	/*
     * InstanceMethod
     * This method is an instance method.
     * It can access instance variables because
     * it is called using an object.
     */
	 public void InstanceMethod() {
	 System.out.println(
	"This is an intance method.");
	 System.out.println("\tatt1 = " + att1 + ", att2 = " + att2);
	 }
	 /*
	     * StaticMethod
	     * This method is a static method.
	     * It belongs to the class and not to any object.
	     * Static methods cannot access instance variables directly.
	     */
	 public static void StaticMethod() {
	 System.out.println(
	"This is a static method.");
	// The following code is not allowed because
     // static methods cannot access instance variables
     // System.out.println("\tatt1 = " + att1 + ", att2 = " + att2);
 
	 }
	}
