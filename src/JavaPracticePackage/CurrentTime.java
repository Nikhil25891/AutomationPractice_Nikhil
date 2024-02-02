package JavaPracticePackage;

import java.time.LocalTime;

public class CurrentTime {

	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();

	       // Check if it's day or night based on the hour
	       if (now.isBefore(LocalTime.of(18, 0))) 
	       {
	           System.out.println("It is day time...");
	       } 
	       
	       else 
	       {
	           System.out.println("It is night time...");
	       }
	   }
	}

