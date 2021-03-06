/*@Author:-Rushikesh Shelke
 * 
Problem
Alice has N boxes, and each box has certain non zero number of chocolates. These boxes are numbered from 1 to N.

Alice is planning to go to wonderland. She wants to carry exactly K number of chocolates and she can carry only 2 boxes. 
So she wants to know the number of ways in which she can select 2 boxes such that total number of chocolates in them is K.

Input
First line of the input is the number of test cases T. It is followed by T test cases. Each test case has 3 lines. 
First line is the number of boxes N and the next line has N space separated integers 
where the ith integer is the number of chocolates in the ith box and 3rd line of each test case contains value of K.

Output
For each test case, output a single number, the number of ways in which she can select the boxes.

Constraints

1<=T(number of test cases)<=10

1<=N<=10^5

1<=Number of Chocolates in ith box<=100


Sample Input
3
5
1 2 3 4 3
6
5
1 1 1 1 1
2
5
1 5 3 3 3
6
Sample Output
2
10
4

 * */
import java.util.*;
public class Chocolates_and_Boxes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int arr[][]=new int[t][];
		int result[]=new int[t];
		for(int i=0;i<arr.length;i++)
		{
			int n=sc.nextInt();
			arr[i]=new int[n];
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			int k=sc.nextInt();
			int count=0;
			for(int l=0;l<arr[i].length;l++)
			{
				for(int m=l+1;m<arr[i].length;m++)
				{
					if(arr[i][l]+arr[i][m]==k)
					{
						count++;
					}
				}
			}
			result[i]=count;
		}
		System.out.println("Output Is:");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}

/*
3
5
1 2 3 4 3
6
5
1 1 1 1 1
2
5
1 5 3 3 3
6
Output Is:
2
10
4
 * */
