/* WAP TO FIND LONGEST CONSECUTIVE SEQUENCE AND  DISPLAY IT'S MAXIMUM LENGTH */


import java.util.*;
public class LCS {
	
	
	// Longest Consecutive Sequence

	public static void main(String[] args) {
		int arr[]= {3,9,1,10,4,20,2,2};
		HashSet<Integer> hs=new HashSet<>();
		for(int no:arr)
		{
			hs.add(no);
		}
		int len=0;
		System.out.println("Longest Consecutive Sequence is:");
		for(int i=0;i<arr.length;i++)
		{
			
			if(!hs.contains(arr[i]-1))
			{
				int number=arr[i];
				
				while(hs.contains(number))
				{
					System.out.print(" "+number);
					number++;
					
				}
				System.out.println();
				
				if ( len<number-arr[i])
				{
					len=number-arr[i];
				}
				 
			}
			
		}
		System.out.println("Longest Consecutive Sequence Length is "+len);
	}

}
