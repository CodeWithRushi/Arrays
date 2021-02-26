/* WAP TO DISPLAY THE dUPLICATE ELEMENT */


/*      METHOD 1: SIMPLE METHOD

public class DisplayDuplicateElement {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,2,1};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" ");
				}
			}
			
		}
		
		

	}

}
*/


/*      
		METHOD 2: USING SET METHOD

import java.util.*;
public class DisplayDuplicateElement {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,2,1};
		Arrays.sort(arr);
		Set<Integer> s=new HashSet<>();
		for(int n:arr)
		{
			if(s.add(n)==false)
				System.out.println(n);
		}
		

	}

}

*/


/*

	//METHOD 3:-USING MAP  AND SET INTERFACE


import java.util.*;
public class DisplayDuplicateElement {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,2,1};
		Arrays.sort(arr);
		Map<Integer,Integer> m=new HashMap<>();
		for(int no:arr)
		{
			Integer count=m.get(no);
			if(count==null)
			{
				m.put(no, 1);
			}
			else
			{
				count=count+1;
				m.put(no,count);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> sm=m.entrySet();
		System.out.print("ELEMENT"+" "+"COUNT");
		System.out.println();
		for(Map.Entry<Integer, Integer> me :sm)
		{	/*	
			if(me.getValue()>1)
				System.out.println(me.getKey()+" "+me.getValue());
			else
				System.out.println(me.getKey()+" "+me.getValue());
				*/
			System.out.println("  "+me.getKey()+"       "+me.getValue());
		}

	}

}

*/
