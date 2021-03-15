/*
	 WAP TO CONVERT DECIMAL TO OCTAL
*/

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int n=sc.nextInt();
		isOctal(n);

	}
	static void isOctal(int n)
	{
		int i=0;
		int original=n;
		int[] arr=new int[15];
		do 
		{
			 arr[i]=n%8;
			
			n=n/8;
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
The Decimal Number of 15 is 17

*/