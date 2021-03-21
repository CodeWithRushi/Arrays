package Problem_Statment;
import java.util.*;
public class CountOccurencesDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int l=sc.nextInt();
		int u=sc.nextInt();
		int x=sc.nextInt();
		int result=countDigitOccurences(l,u,x);
		System.out.println("The Count Of Digit Occurences is "+result);

	}

	static int countDigitOccurences(int l,int u,int x)
	{
		
		int count=0;
		while(l<=u)
		{
			int n=l;
			while(n>0)
			{
				if(n%10==x)
				{
					count++;
				}
				n=n/10;
			}
			l++;
		}
		return count;
	}
}
