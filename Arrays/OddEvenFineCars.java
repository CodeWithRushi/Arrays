/*IMPLEMENT THE FUNCTION TO CALCULATE THE FINE COLLECTION
		1. IF DATE IS EVEN,FINE OF 250 IS CHARGED ON EACH ODD NUMBERED CAR RUNNING ON THAR DATE
		2. IF DATE IS ODD,FINE OF 250 IS CHARGED ON EACH EVEN NUMBERED CAR RUNNING ON THAR DATE
*/

import java.util.*;
public class OddEvenFineCars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		int date=sc.nextInt();
		System.out.println("How Many Cars are Available Today");
		int n=sc.nextInt();
		System.out.println("Enter Car Numbers");
		int cars[]=new int[n];
		for(int i=0;i<n;i++)
		{
			cars[i]=sc.nextInt();
		}
		System.out.println("The Total Fine is "+oddEvenFine(date,cars,n));

	}

	static int oddEvenFine(int date,int[] cars,int n)
	{
		int fine=250;
		int Total_Fine=0;
		if(date%2==0)
		{
			for(int i=0;i<cars.length;i++)
			{
				if(cars[i]%2!=0)
				{
					Total_Fine+=fine;
				}
				
			}
			return Total_Fine;
		}
		else
		{
			for(int i=0;i<cars.length;i++)
			{
				if(cars[i]%2==0)
				{
					Total_Fine+=fine;
				}
				
			}
			return Total_Fine;
			
		}
		
	
	}

}




/*

OUTPUT:-

Enter Date
6
How Many Cars are Available Today
8
Enter Car Numbers
9871
4687
9687
2096
8769
8476
2968
7174
The Total Fine is 1000





*/