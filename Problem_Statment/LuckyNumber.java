package Problem_Statment;
import java.util.*;
public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int N=sc.nextInt();
		boolean s=isLuckyNumber(N);
		if(s==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static boolean isLuckyNumber(int n)
	{
		int sum1=0,sum2=0;
		int count=totalDigit(n);
		if(count%2!=0)
			return false;
		else
		{
			int mid=count/2;
				do
				{
					int reminder=n%10;
					sum1+=reminder;
					n=n/10;
					count--;
				}while(count>mid);
				do
				{
					int reminder=n%10;
					sum2+=reminder;
					n=n/10;
					count--;
				}while(count>0);
				
				if(sum1==sum2)
				{
					return true;
				}
				else
				{
					return false;
				}
		}
	}
	static int totalDigit(int n)
	{
		int count=0;
		do
		{
			int reverse=n%10;
			count++;
			n=n/10;
		}while(n>0);
		return count;
	}
}
