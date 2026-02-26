package edu.lifeuniversity.css.java.example2;

/**
 * The Student class represents a student and extends the Person class.
 * 
 * <p>This class adds a student number to the basic Person information.
 * It demonstrates inheritance by reusing attributes and methods from
 * the Person class while adding additional student-specific behavior.</p>
 * 
 * 
 * 
 */
public class Student extends Person {

    /** The student's identification number */
    private int studentNumber;

    /**
     * Default constructor.
     * Calls the parent constructor and sets the student number to 0
     * (indicating no student number yet).
     */
    public Student() {
        super();
        studentNumber = 0; // Indicating no number yet
    }

    /**
     * Constructor that initializes the student's name and student number.
     * 
     * 
     * 
     */
    public Student(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    /**
     * Resets the student's name and student number.
     * 
     */
    public void reset(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    /**
     * Returns the student's number.
     * 
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * Sets the student's number.
     * 
     */
    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    /**
     * Displays the student's information.
     * Overrides the writeOutput() method from Person.
     */
    @Override
    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    /**
     * Compares this student with another student.
     * Two students are considered equal if they have the same name
     * (case-insensitive) and the same student number.
     * 
     */
    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent)
                && (this.studentNumber == otherStudent.studentNumber);
    }
}