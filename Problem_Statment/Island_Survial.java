/* 	Wap to Check if it is possible to survive on Island

You are a poor person in an island. There is only one shop in this island, this shop is open on all days of the week except for Sunday. Consider following constraints: 

N – Maximum unit of food you can buy each day.
S – Number of days you are required to survive.
M – Unit of food required each day to survive.
Currently, it’s Monday, and you need to survive for the next S days. 
Find the minimum number of days on which you need to buy food from the shop so that you can survive the next S days, or determine that it isn’t possible to survive. 

*/

import java.util.*;
public class Island_Survial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int S[]=new int[T];
		int N[]=new int[T];
		int M[]=new int[T];
		int T1[]=new int[T];

		for(int i=0;i<T;i++)
		{
			
			S[i]=sc.nextInt();
			N[i]=sc.nextInt();
			M[i]=sc.nextInt();
		}
		for(int i=0;i<S.length;i++)
		{
			int quentity=(S[i]*M[i])-N[i];
			if(quentity<S[i])
			{
				T1[i]=2;
				
			}
			else
			{
				T1[i]=-1;
				
			}
				
		}
		System.out.println("The Ouput Is");
		for(int j=0;j<T1.length;j++)
		{
			
			System.out.println(T1[j]);
		}
	}

}


/*
2
10 16 2
10 20 30
The Ouput Is
2
-1
 */
