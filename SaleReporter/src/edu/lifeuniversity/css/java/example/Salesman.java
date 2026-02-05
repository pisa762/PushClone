package edu.lifeuniversity.css.java.example;

public class Salesman implements Comparable<Salesman> {
	//private element of salesman can only use in salesman
	private String name;
	private double sales;
	
	// method for receive the value that user input
	public String getName() {
		return name;
	}
	
	// to set what name the user input method
	public void setName(String name) {
		this.name = name;
	}
	
	//
	public double getSales() {
		return sales;
	}
	
	public void setSales(double sales) {
		this.sales = sales;
	}

	@Override
	public int compareTo(Salesman anotherSalesman) {
		
		return name.compareTo(anotherSalesman.name);
	}
}