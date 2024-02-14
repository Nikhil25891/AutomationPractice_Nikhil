package JavaPracticePackage;

public class MultidimensionalArray1 {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][2];
		
		arr[0][0] = 2;
		arr[0][1] = 4;
		arr[1][0] = 6;
		arr[1][1] = 8;
		
		for(int i=0 ; i<2 ; i++)   // Row
		{
			for(int j=0 ; j<2 ; j++)   //Column
			{
				System.out.print(arr[i][j] + "   ");
			}
			
			System.out.println("");
		}

	}

}
