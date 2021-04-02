/*
WAP A PROGRAM FOR THIS PROBLEM AND PRINT THE TOTAL NUMBERS OF PAIRS WHOSE SUM IS K.
PRINT "0" IF NO PAIR IS FOUND
 * */
package Problem_Statment;
import java.util.*;
public class SumOfPairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Number Do You Want To Insert");
		int n=sc.nextInt();
		System.out.println("Enter Sum Value");
		int k=sc.nextInt();
		int pair=0;
		int arr[]=new int[n];
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if((arr[i]+arr[j])==k)
				{
					
					pair++;
					System.out.println(arr[i]+","+arr[j]);
				}
				
				
			}
		}

		if(pair==0)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println(pair);
		}
	}

}

/*
How Many Number Do You Want To Insert
5
Enter Sum Value
6
Enter Element
5
1
2
3
4
Pair Is:-
5,1
2,4
Count Of Pair Is:-
2

 */
