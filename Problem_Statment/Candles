/*
 YOU ARE GIVEN N CANDLES AND THE LENGTH OF EACH CANDLE IS STORED IN AN ARRAY A.
 THE CANDLES WILL FORM A TRIPLET IF A[i]?A[j]>A[k] ABD i<j<k
 DISPLAY THE TOTAL COUNT OF THE NUMBER OF CANDLE TRIPLETES
 * */

package Problem_Statment;
import java.util.*;
public class Candles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total no of Candles ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=candleTriplets(arr);
		System.out.println(count);

	}

	static int candleTriplets(int[] arr)
	{
		int count=0;
		if(arr.length==3)
			return 1;
		else
			for(int i = 0; i <arr.length; i++)
			       for(int j = i + 1; j < arr.length; j++)
			          for(int k = j + 1; k < arr.length; k++)
			             if (arr[i] > arr[j] &&
			                 arr[j] > arr[k])
			             {
			                 count += 1;
			             }
		
		return count;	              
		
	}
}


/*
 
OUTPUT:-

Enter Total no of Candles 
4
Enter Values
13
6
9
2
2

Enter Total no of Candles 
3
Enter Values
7
4
2
1



 */
