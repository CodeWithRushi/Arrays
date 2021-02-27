/* WAP TO FIND THE NUMBER IS EVEN OR ODD. AND CALCULATE COUNT OF EVEN ELEMENTS AND ODD ELEMENTS
	AS WELL AS SUM OF THE ALL EVEN AND ALL ODD NUMBERS */


import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		int arr[]= {5,8,12,7,6,2,4,45,77,33,56,78,44,};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				al1.add(arr[i]);
			}
			else
			{
				al2.add(arr[i]);
			}
		}
		System.out.println("The Even Element ArrayList is ");
		int total=0;
		for(int no:al1)
		{	total=total+no;
			System.out.println("  "+no);
		}
		System.out.println("There are "+al1.size()+" Elements are Present in Even Arraylist");
		System.out.println("The Sum of Even Arraylist Element is "+total);
		System.out.println();
		System.out.println("The Odd Element ArrayList is ");
		for(int no:al2)
		{	total=total+no;
			System.out.println("  "+no);
		}
		System.out.println("There are "+al2.size()+" Elements are Present in Even Arraylist");
		System.out.println("The Sum of Even Arraylist Element is "+total);

	}

}
