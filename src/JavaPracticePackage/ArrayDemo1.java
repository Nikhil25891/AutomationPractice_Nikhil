package JavaPracticePackage;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];  //Array declaration and memory allocation using "new" keyword
		
		arr[0] = 12;
		arr[1] = 23;
		arr[2] = 34;
		arr[3] = 45;
		arr[4] = 56;
		
		for(int i=0 ; i<arr.length ;i++)
		{
			System.out.print(arr[i] + "\t");
		}

	}

}
