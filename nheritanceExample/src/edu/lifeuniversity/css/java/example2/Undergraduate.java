package edu.lifeuniversity.css.java.example2;

/**
 * The Undergraduate class represents an undergraduate student.
 * It extends the Student class by adding an academic level.
 * 
 * The level represents:
 * 1 = Freshman
 * 2 = Sophomore
 * 3 = Junior
 * 4 = Senior
 */
public class Undergraduate extends Student {

    /** The academic level of the undergraduate student (1–4). */
    private int level;

    /**
     * Default constructor.
     * Sets level to 1 (Freshman).
     */
    public Undergraduate() {
        super();
        level = 1;
    }

    /**
     * Constructs an Undergraduate with name, student number, and level.
     */
    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel);
    }

    /**
     * Resets the undergraduate's information.
     */
    public void reset(String newName, int newStudentNumber, int newLevel) {
        super.reset(newName, newStudentNumber);
        setLevel(newLevel);
    }

    /**
     * Returns the academic level.
     *
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the academic level.
     * Level must be between 1 and 4.
     *
     */
    public void setLevel(int newLevel) {
        if (1 <= newLevel && newLevel <= 4)
            level = newLevel;
        else {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }

    /**
     * Displays the undergraduate's information.
     */
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student Level: " + level);
    }

    /**
     * Compares this undergraduate with another undergraduate.
     *
     */
    public boolean equals(Undergraduate otherUndergraduate) {
        return super.equals(otherUndergraduate)
                && this.level == otherUndergraduate.level;
    }
}