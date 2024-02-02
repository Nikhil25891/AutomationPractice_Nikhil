package JavaPracticePackage;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		
		int num1 = scr.nextInt();
		
		System.out.println(" ");   //for next line
		
		System.out.print("Enter Second Number: ");
		
		int num2 = scr.nextInt();
		
		System.out.println(" ");   //for next line
		
		int add = num1 + num2;
		
		int sub = num1 - num2;
		
		int mul = num1 * num2;
		
		float div = num1 / num2;
		
		System.out.println("Addition is: " +add);
		
		System.out.println("Subtracion is: " +sub);
		
		System.out.println("Multiplication is: " +mul);
		
		System.out.println("Division is: " +div);

	}

}
