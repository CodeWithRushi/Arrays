/*
There are N number of baskets, where the ith basket contains input2[1]
apples
We want to move apples between baskets so that all baskets have the same
number of apples. What is the minimum number of apples that must be
moved?
it is guaranteed that there exists a way to move apples so as to have an
equal number of apples in each basket.
a

Input Specification:
input1: N, denoting the Number of Baskets
input2: array representing the number of apples in the ith basket

Output Specification:
Return the minimum number of apples that must be moved so that all
	baskets have the same number of apples​
 * */
import java.util.Scanner;
public class MovingApples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Number of Baskets");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enetr Number of Apples");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
					
		}
		System.out.println("The Minimum Number of Apples is:");
		System.out.println(moveApples(n1,arr1));

	}
	static int moveApples(int input1,int[]input2)
	{
		int sum=0;
		for(int i=0;i<input2.length;i++)
		{
			sum+=input2[i];
		}
		int avg=sum/input1;
		int minApp=0;
		for(int i=0;i<input2.length;i++)
		{
			if(input2[i]>=avg)
			{
				minApp+=input2[i]-avg;
			}
		}
		return minApp;
	}

}

/*
Enetr Number of Baskets
2
Enetr Number of Apples
1 3
The Minimum Number of Apples is:
1


Enetr Number of Baskets
5
Enetr Number of Apples
2849 1620 705 1 30
The Minimum Number of Apples is:
2387
 */
