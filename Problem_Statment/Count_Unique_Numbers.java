/*
YOU ARE GIVEN TWO LISTS OF DIFFERENT LENGTHS OF POSITIVE INTEGERS.
WRITE AN ALGORITHM TO COUNT THE NUMBER OF ELEMENTS THAT ARE NOT COMMON TO EACH LIST
1 1 2 3 4 5 5 7 6 9 10
11 12 13 4 5 6 7 18 19 20
 * */

import java.util.*;
public class Count_Unique_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr First Array Length");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enetr Numbers");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
					
		}
		System.out.println("Enetr Second Array Length");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enetr Numbers");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
					
		}
		System.out.println("The Unique Count Is:");
		System.out.println(count(n1,arr1,n2,arr2));
	}

	static int count(int n1,int[]arr1,int n2,int []arr2)
	{
		int count=0;
		boolean flag=false;
		for(int i=0;i<arr1.length;i++)
		{
			flag=false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
				count++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			flag=false;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
				count++;
		}
		return count;
	}
}

/*
Enetr First Array Length
11
Enetr Numbers
1 1 2 3 4 5 5 7 6 9 10
Enetr Second Array Length
10
Enetr Numbers
11 12 13 4 5 6 7 18 19 20
The Unique Count Is:
12

 * */
