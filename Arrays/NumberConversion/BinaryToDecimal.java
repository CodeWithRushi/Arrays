/*
	 WAP TO CONVERT BINARY TO DECIMAL
*/

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int n=sc.nextInt();
		binaryToDecimal(n);

	}

	static void binaryToDecimal(int n)
	{
		int sum=0;
		int p=1;
		do
		{
			int reminder=n%10;
			sum+=(reminder*p);
			p=p*2;
			n=n/10;	
		}while(n>0);
		
		System.out.println(sum);
	}
	
	
}

/*
OUTPUT:-
Enter Binary Number
1111
The Decimal Number of 1111 is 15


*/