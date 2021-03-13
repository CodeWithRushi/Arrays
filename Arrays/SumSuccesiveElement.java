//  WAP TO CALCULATE THE SUM OF EVERY SUCCESSIVE Nth ELEMENT IN THE ARRAY AND RETURN THE SAME.

import java.util.*;
public class SumSuccesiveElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size Of Array");
	int L=sc.nextInt();
	int arr[]=new int[L];
	for(int i=0;i<L;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Eneter Successive Element");
	int N=sc.nextInt();
	System.out.println(sumSuccessiveElement(arr,L,N));
	
	}

	static int sumSuccessiveElement(int[] arr,int l,int n)
	{
		int sum=0;
		for(int j=n-1;j<arr.length;j=j+n)
		{
			
			sum=sum+arr[j];
			
		}
		
		return sum;
	}
}
