package edu.lifeuniversity.css.java.example;

import java.util.Arrays;
import java.util.Scanner;
//Java Course – Life University
//Date: 2/5/2026


public class SalesReporter {
	// private variable can only use in sales report
	private double highestSales;
	private double averageSales;
	private Salesman[] team; //string
	private int numOfSalesman;//seller 

	public static void main(String[] args) {
		//create a new instance object for a new constructor
		SalesReporter myReporter = new SalesReporter();
		myReporter.run();
	}
	
	public void run() {
		//method element of run
		getData();
		cacluateAverageSales();
		calculateHighestSales();
		printOutResults();
		
		sortByNameAndPrint();
	}
	
	private void sortByNameAndPrint() {
		// for sorting
		Arrays.sort(team);
		
		System.out.println();
		
		for(Salesman sm: team) {
			System.out.println(sm.getName() +": " +sm.getSales());
		}
	}

	public void getData() {
	// input number of sale and the num of sale man
		Scanner myScanner = new Scanner(System.in);
		
		// receive the data input of sales man
		System.out.println("Input the number sales men: ");
		numOfSalesman = myScanner.nextInt();		
		
		//team come from string sale man
		team = new Salesman[numOfSalesman];
		//loop for checking how many sale men get the sale men name 
		// get each sale men data of their sales 
		for(int i=0; i<numOfSalesman;i++) {
			
			myScanner.nextLine();
			
			System.out.println("Enter data for associate number" + (i+1));
			
			System.out.println("Enter name:");
			String name = myScanner.nextLine();
			
			System.out.println("Enter Sales:");
			double sales = myScanner.nextDouble();
			
			team[i] = new Salesman();
			
			team[i].setName(name);
			team[i].setSales(sales);
		}
		myScanner.close();
	}
	
	public void cacluateAverageSales() {
		//calculate the whole avg of sale from each sales mem sale of their product
		double sum = 0;
		
		for(Salesman sm:team) {
			sum = sum + sm.getSales();
		}
		
		averageSales = sum/team.length;
	}
	
	public void calculateHighestSales() {
		// calculate to find who get the highest sale
		Double currentHighestValue = 0.0;
		
		for(Salesman sm:team) {
			if(currentHighestValue < sm.getSales()) {
				currentHighestValue = sm.getSales();
			}
		}
		
		highestSales = currentHighestValue;
	}
	
	public void printOutResults() {
		
		System.out.println("Average: " + averageSales);
		System.out.println("Highest sales: " + highestSales);
		
		System.out.println("The Highest sales guy");
		
		for(Salesman sm:team) {
			if(sm.getSales() == highestSales) {
				System.out.println("Name: " + sm.getName());
				System.out.println("Sales: " + sm.getSales());
			}
		}
		
		System.out.println("The other sales guy");
		for(Salesman sm:team) {
			if(sm.getSales()!= highestSales) {
				System.out.println("Name: " + sm.getName());
				System.out.println("Sales: " + sm.getSales());
			}
		}
	}

}
/*
* this program use to get the number total of sale men who sell
* and get their name with the number of their sell 
* then calculate the avg of each sale men sale
* and calculate to find out who sale the highest 
* then show the result of all the sale men and their sale data
* 
* */