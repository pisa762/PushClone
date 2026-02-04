package pip.it.java.year3.staticmethod;
//Java Course – Life University
//Date: 2/4/2026
//This program demonstrates how to call
//instance methods and static methods in Java.

/*
 * OtherClass
 * This class contains the main method.
 * It creates an object of StaticMethodDemo
 * and shows different ways to call its methods.
 */
public class OtherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of staticmethoddemo
		 // calling instance method
		 StaticMethodDemo a =new StaticMethodDemo();
		 a.InstanceMethod();

		 // calling static method
		 StaticMethodDemo.StaticMethod();
		 a.StaticMethod(); // also possible
		 }
		}
/*
 * This part of the program demonstrates:
 * - Object creation
 * - Calling instance methods
 * - Calling static methods
 */
