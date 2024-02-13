package JavaPracticePackage;

public class NestedLoop4 {

	public static void main(String[] args) {
		
		int k = 3;
		
		for(int i=1 ; i<5 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(k);
				
				k = k + 3;
				
				System.out.print("\t");
			}
			
			System.out.println(" ");
		}

	}

}



/*
3	
6	9
12	15	18
21	24	27	30
*/