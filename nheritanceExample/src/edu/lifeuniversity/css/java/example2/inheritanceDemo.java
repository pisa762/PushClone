package edu.lifeuniversity.css.java.example2;
/**
 * The inheritanceDemo class demonstrates basic inheritance in Java.
 * 
 * <p>This program creates a Student object, sets its name and student number,
 * and then calls the writeOutput() method to display the student's information.</p>
 * 
 * <p>This example shows how a subclass (Student) can use inherited
 * methods from its parent class.</p>
 * 
 * 
 * 
 */

public class inheritanceDemo {
	 /**
     * The main method is the entry point of the program.
     * 
     * 
     */

	 public static void main(String[] args) {

	        // Create a Student object
	        Student s = new Student();

	        // Set the student's name
	        s.setName("Warren Peace");

	        // Set the student's number
	        s.setStudentNumber(1234);

	        // Display the student's information
	        s.writeOutput();
	    }
	}