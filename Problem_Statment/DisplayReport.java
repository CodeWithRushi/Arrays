/*
 * TOTAL NUMBER OF PARTICIPANTS 'P',100<=P<=200.
 * IF TOTAL NUMBER OF PARTICIPANTS  REGISTERED IS EVEN  THEN DIVIDE THE EQUAL PARTS IN 4 GROUP
 * OR TOTAL NUMBER OF PARTICIPANTS REGISTERED IS ODD THEN DIVIDE 4 GROUP AND REMAING PATICIATE ADD IN LAST GROUP
 * */
package Problem_Statment;
import java.util.*;
public class DisplayReport {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Number Participants");
		int p=sc.nextInt();
		participantsInGroups(p);
	}
	static void participantsInGroups(int p)
	{
		if(p<100 || p>200)
		{
			System.out.println("Invalid Input");
		}
		else
		{ int group=4;
			if(p%2==0)
			{
				int A=p/group;
				while(group>0)
				{
					System.out.println(A);
					group--;
				}
			}
			else
			{
				int A=p/group;
				while(group>1)
				{
					System.out.println(A);
					p=p-A;
					group--;
				}
				System.out.println(p);
			}
		}
		
	}

}
/*
 
OUTPUT:-
 
Enter Total Number Participants
127
31
31
31
34

Enter Total Number Participants
104
26
26
26
26

Enter Total Number Participants
300
Invalid Input

Enter Total Number Participants
12
Invalid Input

*/
