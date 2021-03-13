/* WAP TO ACCEPT TWO ARRAY ELEMENT,FIND THE PAIR OF VALUES WITH THE SMALLEST ABSOLUTE DIFFERENCE.

import java.util.*;
public class SmallestDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Size");
		int N1=sc.nextInt();
		int arr1[]=new int[N1];
		for(int i=0;i<N1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array Size");
		int N2=sc.nextInt();
		int arr2[]=new int[N1];
		for(int i=0;i<N1;i++)
		{
			arr2[i]=sc.nextInt();
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int diff=arr1[0]-arr2[0];
		System.out.println("The smallest absolute difference between Two numbers both from different arrrays is "+diff);
		
	}

}
