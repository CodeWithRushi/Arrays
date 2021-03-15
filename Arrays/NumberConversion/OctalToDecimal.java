/*
	 WAP TO CONVERT OCTAL TO DECIMAL
*/

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Octal Number");
		int n=sc.nextInt();
		octalToDecimal(n);
	}

	static void octalToDecimal(int n)
	{
		int p=1;
		int sum=0;
		do
		{
			int reminder=n%10;
			sum=sum+(reminder*p);
			p=p*8;
			n=n/10;
		}while(n>0);
		System.out.println("The Decimal Number of "+original +" is "+sum);
	}
}

/*
OUTPUT:-
Enter Octal Number
345
The Decimal Number of 345 is 229
*/