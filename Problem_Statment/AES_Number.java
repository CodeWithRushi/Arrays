/*
WAP TO FIND THE AES NUMBER WITHIN RANGE AND COUNT OF THIS AES NUMBERS


AES NUMBER
	THE AES NUMBER MEANS THE NUMBER HAS ONLY 4 DIVISIORS AND COUNT THIS AES NUMBERS
*/
import java.util.*;
public class AES_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int n=sc.nextInt();
		int totalcount=0;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
				count++;
					
				}
			}
			
			if(count==4)
			{
				totalcount++;
			}
		}
		System.out.println(totalcount);	
	}

}

/*
Enter Range
20

5
*/
