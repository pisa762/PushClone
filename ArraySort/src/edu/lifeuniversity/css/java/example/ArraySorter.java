package edu.lifeuniversity.css.java.example;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
	
	private Scanner myKeyboard;
	
	int[] numbers;

	public static void main(String[] args) {
		
		// As a Java programmer, I do not like to put any logic in the main method.
		// I just instantiate the first object and call the method that can start my program logic.
		ArraySorter arraySorter = new ArraySorter();
		arraySorter.run();

	}
	
	public void run() {
		
		myKeyboard = new Scanner(System.in);
		
		getNumbers();
		runSelectionSort();
		printSortingResult();
		
		getNumbers();
		runBuiltInSort();
		printSortingResult();
		
		myKeyboard.close();
		
	}
	
	private void runBuiltInSort() {
		Arrays.sort(numbers);
	}

	private void printSortingResult() {
		System.out.println("Array values after sorting:");
		for(int i=0; i < numbers.length;i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	public void getNumbers(){
		
		System.out.print("How many numbers do you want to sort?: ");
		
		int numOfNumbers = myKeyboard.nextInt();
		
		numbers = new int[numOfNumbers];
		
		for(int i=0; i < numOfNumbers;i++){
			numbers[i] = myKeyboard.nextInt();
		}
		
		System.out.println("Array values before sorting:");
		for(int i=0; i < numOfNumbers;i++){
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n");
	}
	
	public void runSelectionSort() {
		
		// loop to sort.
		// 1. find the smallest number put it the first index.
		// 2. find the smallest number from the second index.
		// 3. fond the smallest number from the third index,
		// 4. ...
		
		for(int i=0; i < numbers.length;i++){
			// get index of smallest number
			int indexOfSmallestNumber = getIndexOfSmallestNumber(i,numbers);
		
			// swap
			if(i!=indexOfSmallestNumber)
				swap(i,indexOfSmallestNumber,numbers);
		
		}
	}

	private void swap(int targetIndex, int indexOfSmallestNumber,int[] numbers) {
		int temp = numbers[targetIndex];
		numbers[targetIndex] = numbers[indexOfSmallestNumber];
				numbers[indexOfSmallestNumber] = temp;
	}

	private int getIndexOfSmallestNumber(int targetIndex, int[] numbers) {
		
		int smallestIndex = targetIndex;
		
		for(int i=targetIndex; i < numbers.length-1; i++){
			
			if(numbers[smallestIndex] > numbers[i+1]){
				smallestIndex = i+1;
			}
		}
		
		return smallestIndex;
	}

}