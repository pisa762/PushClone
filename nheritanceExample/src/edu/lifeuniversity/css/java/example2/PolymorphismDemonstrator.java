package edu.lifeuniversity.css.java.example2;

/**
 * The PolymorphismDemonstrator class demonstrates the concept of
 * inheritance and runtime polymorphism in Java.
 * 
 * <p>This program creates an array of Person references that store
 * different types of objects (Student and Undergraduate).
 * It shows how method overriding works and how type casting
 * can be used to access subclass-specific methods.</p>
 * 
 * It also demonstrates upcasting in the inheritance hierarchy:
 * Undergraduate → Student → Person → Object.
 * 
 * @author YourName
 * @version 1.0
 */
public class PolymorphismDemonstrator {

    /**
     * The main method is the entry point of the program.
     * It demonstrates polymorphism, instanceof checking,
     * upcasting, and method overriding.
     * 
     */
    public static void main(String[] args) {

        // Create an array of Person references
        Person[] people = new Person[4];

        // Store different subclass objects inside Person array
        people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
        people[1] = new Undergraduate("Kick, Anita", 9931, 2);
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Undergraduate("Bugg, June", 9901, 4);

        // Demonstrate runtime polymorphism
        for (Person p : people) {
            System.out.println("Student Name: " + p.getName());

            // Check if the object is of type Undergraduate before casting
            if (p instanceof Undergraduate) {
                Undergraduate studentObj = (Undergraduate) p;
                System.out.println("Student Level: " + studentObj.getLevel());
            }

            System.out.println();
        }

        // Demonstrate upcasting
        Undergraduate ug = new Undergraduate("Nam, JC", 1111, 4);
        Student st = ug;     // Upcast to Student
        Person ps = ug;      // Upcast to Person
        Object obj = ug;     // Upcast to Object

        // Polymorphic method calls
        st.writeOutput();
        ps.writeOutput();
        System.out.println(obj.toString());
    }
}