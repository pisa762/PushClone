package edu.lifeuniversity.css.java.example;
/*
 * Java Course-Life university
 * Piseth Pisa
 * date 2/12/2026
 * 
 * this program used to calculate and checking the employee log time in their work 
 * by the user input the employee data of hour they work from monday-friday
 */
import java.util.Scanner;

public class TimeRecorder {
	
	/*standard number of work days in a week*/ 
	private final int NUM_OF_WORK_DAYS = 5; // An employee works for five days from Monday to Friday
	/*2D array to store hour where row are employee and column are hour*/
	private int[][] hours;
	/* day of the work day*/
	private enum WeekDays {Monday, Tuesday, Wendesday, Thursday, Friday};
	/*array to store the sum of hour for each specific  week day*/
	private int[] dayHours = new int[WeekDays.values().length];
	/*array to store the sum of hour for each specific employee*/
	private int[] weekHours;
	
	public static void main(String[] args) {
		
		TimeRecorder myTimeRecoder = new TimeRecorder();
		
		myTimeRecoder.getData();
		
		myTimeRecoder.computeTotalPerWeekDay();
		myTimeRecoder.computeTotalPerEmployee();
		
		myTimeRecoder.printResults();

	}
	
	// to receive data from the user 
	public void getData() {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("How many employees do you want" +
								"to process for their work time? ");
		
		int numOfEmployees = myScanner.nextInt();
		/* get the data from number of employee and their num day of week into hour variable*/
		hours = new int[numOfEmployees][NUM_OF_WORK_DAYS];
		
		 /**
         * Outer loop: iterates through each employee.
         * Inner loop: iterates through each weekday for that employee.
         * Purpose
         */
		for(int employeeCount=0; employeeCount < hours.length; employeeCount++) {
			
			System.out.println("Input work time for Employee " + (employeeCount+1) + ": ");
			/* showing their day and input how many hour they have to week on that day*/
			for(WeekDays currentDay:WeekDays.values()) {
				
				System.out.print("  Input work time for Employee " + (employeeCount+1) 
									+ " on " + currentDay + ": ");
				hours[employeeCount][currentDay.ordinal()] = myScanner.nextInt();
			}
		}
		
		myScanner.close();	
	}
	// this function use to calculate the total hour per week of the employee work of both employee
	public void computeTotalPerWeekDay() {
			
		for(WeekDays currentDay:WeekDays.values()) {
			
			dayHours[currentDay.ordinal()] = 0;
			/*this loop is for calculate the hour of each employee have work for a week*/
			for(int employeeCount=0; employeeCount < hours.length; employeeCount++) {	
				dayHours[currentDay.ordinal()] = dayHours[currentDay.ordinal()] 
															+ hours[employeeCount][currentDay.ordinal()];
			}
		}
	}
	// calculate the total hour of both employee work hour through out of their working week
	public void computeTotalPerEmployee() {
		
		weekHours = new int[hours.length];
		/**
         * Outer loop: iterates through each weekday.
         * Inner loop: iterates through each employee for that weekday.
         * Purpose: Sums the hours worked by all employees on each specific day.
         */

		for(int employeeCount=0; employeeCount < hours.length; employeeCount++) {
			
			weekHours[employeeCount] = 0;
			/**
	         * Outer loop: iterates through each employee.
	         * Inner loop: iterates through each weekday for that employee.
	         * Purpose: Sums the hours worked by each employee across the entire week.
	         */

			for(WeekDays currentDay:WeekDays.values()) {
				weekHours[employeeCount] = weekHours[employeeCount] 
															+ hours[employeeCount][currentDay.ordinal()];
			}
		}
		
	}
	/**
     * Prints the results in a tabular format:
     * - Hours worked per employee per day
     * - Total hours per day
     * - Total hours per employee
     */

	public void printResults() {
		
		System.out.println();
		
		// print the first line: Employee   1   2   3   Totals
		System.out.print("Employee" + addSpace("Employee".length()));
		
		for(int employeeCount = 0; employeeCount < hours.length; employeeCount++) {
			System.out.print(employeeCount+1 + "\t");
		}
		
		System.out.print("Totals");
		System.out.println();
		 
        /**
         * Outer loop: iterates through each weekday.
         * Inner loop: prints each employee’s hours for that weekday.
         * Purpose: Displays the daily breakdown of hours worked by each employee,
         * followed by the total hours for that day.
         */

		for(WeekDays currentDay:WeekDays.values()) {
			
			System.out.print(currentDay + addSpace(currentDay.name().length()));
			for(int employCount = 0; employCount < hours.length ;employCount++) {
				System.out.print(hours[employCount][currentDay.ordinal()] + "\t");
			}
			System.out.print(dayHours[currentDay.ordinal()]);
			System.out.println();
		}
		
		// print total per employee
		System.out.print("Total = " + addSpace("Total = ".length()));
		for(int employeeCount = 0; employeeCount < hours.length; employeeCount++) {
			System.out.print(weekHours[employeeCount] +"\t");
		}
	}
	
	private String addSpace(int length) {
		
		final int maxWeekDayLength = 9;
		String spaces = " ";
		
		for(int spaceCount=0; spaceCount < maxWeekDayLength-length; spaceCount++) {
			spaces = spaces + " ";
		}
		
		return spaces;
	}
}

/*
*how the system works
*first it take the user input data of how many employee are there 
*then it will show a screen to input data of each employee working hour 
*through the whole week each one by one no matter how many employee are there it will take one by one 
*after that it calculate the total hour of each employee work sum every hour from their working day from monday-friday
*and it will calculate all the employee working hour through out the week everyday from mon-fri like sum hour of every working employee together 
*lastly it will show the result of every employee with their working hour from mon - fri then sum their working hour for the whole week
*/