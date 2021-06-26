/*
@AUTHOR:-  RUSHIKESH SHELKE

PROBLEM STATMENT:-
 For given numbers N and K, write a function to find 'memorable number'. Let's look at an example to understand the steps to find 'memorable number'. Given N = 46333 and K = 3, 
1. Check if N is 'reversible' or not. ['Reversible' denotes a number sequence that reads the same backward as forward, e.g., 12321] If Yes, return 1. If No, go to step 2. 
2. Convert digits of N to elements of array A. e.g. For N = 46333 Convert to array A = [4, 6, 3, 3, 3] 

3. Replace each element of array A with its 'modified value'. Modified value of A[ i ] = A[ i ]* 5: Modified value of 4 is = 4"5 = 20 Modified value for 6 is = 6"5 = 30 and so on
After replacing elements of array A with their 'modified values', array A will be [20, 30, 15, 15, 151 
4. For each element in the array generated in previous step, find the 'child primes' that are less than the array element. Then, generate the sum of these child primes. A child prime is a number in the TO/177 (2 * p) 1 where p is prime. [Prime numbers are 2, 3, 5, 7, 11 ...1 

For AI01 = 20, for prime number 2, (2 * 2) + 1 = 5 < 20 for prime number 3, (2 * 3) + 1 = 7 < 20 for prime number 5, (2 * 5) + 1 = 11 < 20 for prime number 7, (2 * 7) + 1 = 15 < 20 for prime number 11, (2 * 11) + 1 = 23 > 20. Hence, will not consider 23. So, child primes less than 20 are [5 7 11 151. Sum of child primes for array element A[0] rs - 38 
Similarly for A[1) = 30, child primes that are less than 30 are [5 7 11 15 23 27] Sum of child prime for array element A[1]=88 and so on.
Array is now = [38 88 23 23 23] 
5. Count pairs of the array generated in previous step whose sum is divisible by value K=3. Here pairs which are divisible by 3 are (38,88), (88,23), (88,23) and (88,23). Hence, return 4. This is the 'memorable number' to be returned. 
Input 46333 3 

where, • First line represents value of N • Second line represents value of K 

Expected Output 4 
 * */

import java.util.*;
public class Brain_Puzzler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=sc.nextInt();
		System.out.println("Enter K Value");
		int k=sc.nextInt();
		System.out.println("The Count is: ");
		System.out.println(memorable_number(n,k));
	}

	private static int memorable_number(int n, int k)
	{
		int origin=n;
		int sum=0;
		do 
		{
			int rev=n%10;
			sum=sum*10+rev;
			n=n/10;
			
		}while(n>0);
		if(sum==origin)
		{
			return 1;
		}
		else
		{
			
			String num=Integer.toString(origin);
			char ch[]=num.toCharArray();
			int modified[]=new int[num.length()];
			for(int i=0;i<ch.length;i++)
			{
				modified[i]=ch[i]-48;
			}
			for(int i=0;i<modified.length;i++)
			{
				modified[i]=modified[i]*5;
			}
			int chile_primes[]=new int[modified.length];
			for(int j=0;j<modified.length;j++)
			{
				int limit=modified[j]/2;
				int primesum=0;
				for(int l=2;l<=limit;l++)
				{
					boolean flag=false;
					for(int m=2;m<=l/2;m++)
					{
						if(l%m==0)
						{
							flag=true;
							break;
						}
					}
					if(flag==false)
					{
						primesum+=(2*l)+1;
					}
				}
				chile_primes[j]=primesum;
			}
			
			int count=0;
			for(int j=0;j<chile_primes.length;j++)
			{
				int first=sumelement(chile_primes[j]);
				for(int k1=j+1;k1<chile_primes.length;k1++)
				{
					int second=sumelement(chile_primes[k1]);
					if((first+second)%k==0)
					{
						count++;
					}
				}
				
			}
			
			return count;
		}
		
	}

	private static int sumelement(int i) {
		int sum=0;
		do
		{
			int rem=i%10;
			sum+=rem;
			i=i/10;
		}while(i>0);
		return sum;
	}

}

/*
OUTPUT:-

Enter N Value
46333
Enter K Value
3
The Count is: 
4

 * */
