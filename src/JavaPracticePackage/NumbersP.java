package JavaPracticePackage;

import java.util.Scanner;

public class NumbersP {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter any Number: ");
		
		int num = scr.nextInt();
		
		for(int i=3;i<=num;i=i+3)
		{
			System.out.print(i);
			
			System.out.print("  ");
		}

	}

}
