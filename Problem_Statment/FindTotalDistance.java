/*
 WAP TO FIND THE TOTAL DISTANCE BETWEEN ADJACENT ITEMS FROM AN ARRAY
 * */
package Problem_Statment;
import java.util.*;
public class FindTotalDistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of The Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter ELements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Difference is ");
		System.out.println(findTotalDistance(n,arr));

	}

	static int findTotalDistance(int n,int []arr)
	{
		int distance=0;
		int i=0;
		while(i<n-1)
		{
			int dis=Math.abs(arr[i]-arr[i+1]);
			distance+=dis;
			i++;
		}
		return distance;
	}
}

/*
Enter Size of The Array
5
Enter ELements
10
11
7
12
14
The Difference is 
12
 */
