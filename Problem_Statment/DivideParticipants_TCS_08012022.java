package Problem_Statment;

import java.util.Scanner;

public class DivideParticipants_TCS_08012022 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int participants=sc.nextInt();
		if(participants>=100&&participants<=200)
		{
			if(participants%2==0)
			{
				participants=participants/4;
				for(int i=0;i<4;i++)
				{
					System.out.println(participants);
					
					
				}
			}
			else
			{
				int rem=participants/4;
				int dum=rem*4;
				rem=participants-dum;
				for(int i=0;i<3;i++)
				{
					System.out.println(participants/4);
				}
				System.out.println((participants/4)+rem);
			}
		}
		else
		{
			System.err.println("Invalid Input");
		}

	}

}


/*
OUTPUT:-

205
Invalid Input

124

31
31
31
31


127

31
31
31
34
 * */
 