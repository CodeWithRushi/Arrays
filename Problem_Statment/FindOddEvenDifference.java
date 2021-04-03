/*
WAP TO FIND THE DIFFERENCE BETWEEN THE SUM OF ODD AND EVEN NUMBERS FROM A ARRAY
 * */
package Problem_Statment;

import java.util.Scanner;

public class FindOddEvenDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of The Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter ELements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Difference is ");
		System.out.println(findOddEvenDifference(n,arr));

	}

	static int findOddEvenDifference(int n,int []arr)
	{
		
		int Even=0;
		int Odd=0;
		int i=0;
		while(i<n)
		{
			if(arr[i]%2==0)
			{
				Even+=arr[i];
			}
			else
			{
				Odd+=arr[i];
			}
			i++;
		}
		return Odd-Even;
	}
	

}


/*
Enter ELements
10
11
7
12
14
The Difference is 
-18

 */
