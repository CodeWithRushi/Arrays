/*
	 WAP TO CONVERT DECIMAL TO BINARY
*/

import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int n=sc.nextInt();
		isBinary(n);
		

	}

	static void isBinary(int n)
	{
		int[] arr=new int[15];
			int i=0;
			int original=n;
			do
			{
				arr[i]=n%2;
				
				n=n/2;
				i++;
				
			}while(n>0);
			String hex="";		
			for(int j=i-1;j>=0;j--)
			{
				hex=hex+arr[j];
			}
		
			System.out.println("The Decimal Number of "+original +" is "+hex);
		
	}
}


/*
OUTPUT:-

Enter Decimal Number
15
The Decimal Number of 15 is 1111

*/