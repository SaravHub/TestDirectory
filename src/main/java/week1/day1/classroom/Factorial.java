package week1.day1.classroom;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series of numbers to be print:");
		int series = sc.nextInt();
		int fact=1;
		for (int i = series; i >=1; i--) {
			fact=fact*i;
			//System.out.print(i+"*");
		}
		System.out.print("Facotiral for a Range of "+series+" is "+fact);
	}

}

/*Learnings from this code
 * 1. How the for loop is working 
 * 2. what is Factorial of a No.
 * 3. shortcuts for print in console,for loop & create mainClass*/