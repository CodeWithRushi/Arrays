/* MINDTREE ASKED PROBLEM*/
package Problem_Statment;
import java.util.*;
public class Blocks {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		
		while(arr.length>1)
		{
			int arr2[]=new int[arr.length/2];
			for(int i=0;i<arr2.length;i++)
			{
				arr2[i]=arr[2*i+1];
			}
			arr=arr2;
		}
		
		System.out.println(arr[0]);
	}
	
}

/*
  1,2,3,4,5,6,7,8
  2,4,6,8
  4,8
  8


OUTPUT:-
8
*/
