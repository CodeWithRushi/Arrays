package Problem_Statment;
import java.util.*;
public class Sets_consecutive_natural_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		setConsecutive(n);
	}

	static void setConsecutive(int n)
	{
		int start=1,end=n+1/2;
		int sum=0,count=0;
		while(end>=start)
		{
			for(int i=end;i>=start;i--)
			{
				sum=sum+i;
				if(sum==n)
				{
					for(int j=i;j<=end;j++)
					{	
						System.out.print(j+" ");
						
					}
					System.out.println();
					count++;
					break;
				}
				if(sum>n)
					break;
			}
			sum=0;
			end--;
		}
		System.out.println(count);
	}
}
