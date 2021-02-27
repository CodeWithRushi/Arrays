/* WAP TO FIND COMMON ELEMENTS IN A ARRAY*/




import java.util.*;

 // METHOD 1:- USING ARRAYLIST
/*    
public class CommonElement {

	public static void main(String[] args) {
		int arr1[]= {4,3,7,9,2,4};
		int arr2[]= {5,1,4,8,3};
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					al.add(arr1[i]);
				}
					
			}
		}
		for(int no:al)
		{
			System.out.println(no);
		}
	}

}

*/


// METHOD 2:- USING NORMAL METHOD

/*   
public class CommonElement {

	public static void main(String[] args) {
		int arr1[]= {4,3,7,9,2,4};
		int arr2[]= {5,1,4,8,3};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
					
			}
		}
		
	}

}
*/



// METHOD 2:- USING HASHSET 
public class CommonElement {

	public static void main(String[] args) {
		int arr1[]= {4,3,7,9,2,4};
		int arr2[]= {5,1,4,8,3};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
				}
					
			}
		}
		for(int no:hs)
		{
			System.out.println(no);
		}
	
	}

}
