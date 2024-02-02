package JavaPracticePackage;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter any Number: ");
		
		int num = scr.nextInt();
		
			if(num > 0)
			{
				System.out.println("Entered Number is Positive...");
			}
			
			else if(num < 0)
			{
				System.out.println("Entered Number is Negative...");
			}
			
			else
			{
				System.out.println("Entered Number is Zero...");
			}
					
	}

}
