
/*
GIVEN A LIST NUMBERLIST[]OF INTEGER NUMBERS THAT HAVE SIZE N 
AND ONE ANOTHER N2.ALSO
GIVEN THE SIZE S(INTEGER NUMBER)OF A SUBSET.
THE TASK IS TO FIND THE NUMBER N2 PRESENT IN EVERY NON OVERLAPPING SUBSET OF SIZES S IN NUMBERLIST[].
IF NUMBER N2 IS PRESENT IN EVERY SUBSET PRINT 1 OTHERWISE 0.
 * */
import java.util.*;
public class Number_Present_in_Subset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the N");
		int n=sc.nextInt();
		int numberList[]=new int[n];
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++)
		{
			numberList[i]=sc.nextInt();
		}
		System.out.println("Enter Value of the N2");
		int n2=sc.nextInt();
		System.out.println("Enter Size of the Subset");
		int s=sc.nextInt();
		boolean res=n2_in_subset(numberList,n2,s);
		if(res==true)
			System.out.println("1");
		else
			System.out.println("0");
	}
	static boolean n2_in_subset(int []numberList,int n2,int s)
	{
		boolean flag=false;
		for(int i=0;i<numberList.length;i++)
		{
			flag=false;
			for(int j=0;j<s;j++)
			{
				if( i<=numberList.length-1 &&numberList[i]==n2)
				{
					flag=true;
					
				}
				if(i==numberList.length)
				{
					break;
				}
				
				i++;
				
			}
			
			if(flag!=true)
				return flag;
			i--;
		}
		
		return flag;
	}
}
/*OUTPUT:-
 
 Enter Size of the N
12
Enter numbers
20 1 6 8 13 20 1 7 20 13 16 20
Enter Value of the N2
20
Enter Size of the Subset
3

1


Enter Size of the N
10
Enter numbers
8 5 3 6 9 2 3 6 9 8
Enter Value of the N2
5
Enter Size of the Subset
3

0
 */
