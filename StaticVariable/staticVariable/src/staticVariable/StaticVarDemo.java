package staticVariable;

//Java Course – Life University
//This program demonstrates the difference between
//instance variables and static variables in Java.

/*
* StaticVarDemo
* This class shows how instance variables and static variables
* behave when multiple objects are created.
*/

public class StaticVarDemo {public int instanceVar; // declared as public only for demonstration
public static int staticVar; // declared as public only for demonstration
public static void main(String args[]){
	// Display the initial value of the static variable
    // Static variables can be accessed using the class name
System.out.println("MyClass.staticVar = " + StaticVarDemo.staticVar);
//Create two objects of StaticVarDemo
StaticVarDemo a1 = new StaticVarDemo();
StaticVarDemo a2 = new StaticVarDemo();
// Display initial values of instance variables for both objects
System.out.println("a1.instanceVar = " + a1.instanceVar);
System.out.println("a2.instanceVar = " + a2.instanceVar);

//Access static variable using object references
// This is allowed but not recommended
System.out.println("a1.staticVar = " + a1.staticVar); // also possible
System.out.println("a2.staticVar = " + a2.staticVar); // also possible

//Increment instance variable of object a1
a1.instanceVar++;

//Increment static variable (shared among all objects)
a1.staticVar++;
System.out.println("a1.instanceVar = " + a1.instanceVar);
System.out.println("a1.staticVar = " + a1.staticVar);
System.out.println("a2.instanceVar = " + a2.instanceVar);
System.out.println("a2.staticVar = " + a2.staticVar);
}
}
/*
* This program demonstrates:
* - Instance variables have separate values for each object
* - Static variables are shared across all objects
* - Changes to a static variable affect all instances
*/