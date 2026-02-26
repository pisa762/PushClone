package edu.lifeuniversity.css.java.example2;

/**
 * The Person class represents a person with a name.
 * 
 * <p>This class provides basic functionality such as setting and getting
 * the person's name, displaying the name, and comparing names
 * between two Person objects.</p>
 * 
 * It serves as a base class for other classes such as Student.
 * 
 * 
 * 
 */
public class Person {

    /** The name of the person */
    private String name;

    /**
     * Default constructor.
     * Initializes the name to "No name yet".
     */
    public Person() {
        name = "No name yet";
    }

    /**
     * Constructor that initializes the person's name.
     * 
     * 
     */
    public Person(String initialName) {
        name = initialName;
    }

    /**
     * Sets the person's name.
     * 
     * 
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Returns the person's name.
     * 
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Displays the person's name to the console.
     */
    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    /**
     * Compares this person's name with another person's name,
     * ignoring case differences.
     * 
     */
    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}