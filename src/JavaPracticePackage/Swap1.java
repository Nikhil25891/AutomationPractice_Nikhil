package JavaPracticePackage;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		
		int num1 = scr.nextInt();
		
		System.out.println("Enter the Second Number: ");
		
		int num2 = scr.nextInt();
		
		System.out.print("Numbers Before Swapping: " +num1 +"  and  " +num2);
		
		System.out.println(" ");
		
		num1 = num1 + num2;
		
		num2 = num1 - num2;
		
		num1 = num1 - num2;
		
		System.out.print("Numbers After Swapping: " +num1 +"  and  " +num2);

	}

}
