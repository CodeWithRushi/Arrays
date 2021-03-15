/*
	 WAP TO CONVERT DECIMAL TO HexaDecimal
*/

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int n=sc.nextInt();
		toHexaDecimal(n);

	}

	static void toHexaDecimal(int n)
	{
		int original=n;
		int arr[]=new int[32];
		int i=0;
		while(n>0)
		{
			arr[i]=n%16;
			n=n/16;
			i++;
		}
		String hex="";
		for(int j=i-1;j>=0;j--)
		{
			if(arr[j]<10)
			{
				hex=hex+arr[j];
			}
			else
			{
				switch(arr[j])
				{
				case 10:
					hex=hex+"A";
					break;
				
				case 11:
					hex=hex+"B";
					break;
				
				case 12:
					hex=hex+"C";
					break;
					
				case 13:
					hex=hex+"D";
					break;
				
				case 14:
					hex=hex+"E";
					break;
				
				case 15:
					hex=hex+"E";
					break;
				}
			}
			
			
		}
		System.out.println("The HexaDecimal Number of "+original+" is "+hex);
	}
}


/*
OUTPUT:-

Enter Decimal Number
2478
The HexaDecimal Number of 2478 is 9AE


*/