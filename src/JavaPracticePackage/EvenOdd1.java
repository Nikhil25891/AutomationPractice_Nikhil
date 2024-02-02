package JavaPracticePackage;

import java.util.Scanner;

public class EvenOdd1 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter Any Number: ");
		
		int num = scr.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Entered Nunber is Even...");
		}
		
		else
		{
			System.out.println("Entered Number is Odd...");
		}
	}

}
