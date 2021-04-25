/* 
The Pan Am 73 flight from Bombay to New York en route Karachi and Frankfurt was hijacked by a few Palestinian terrorists at the Karachi International Airport.
The senior flight purser Neerja Banhot withered her fear and helped evacuating the passengers on board.
Neerja planned to evacuated the passengers in rows that have an average age greater than x. 
Given the number of rows, c the number of columns, a list of integers representing the ages of passengers, can you find the number of rows with an average age greater than x?
Input Format The first line of input consists of an integer r, corresponding to the number of rows of seats in the aircraft.
The second line of input consists of an integer c, corresponding to the number of seats in a row.
The next r lines of input consist of c integers that correspond to the ages of passengers.
The next line of input is an integer x corresponding to the cut-off age.
Output Format The output consists of an integer corresponding to t the number of rows with an average age greater than x.

*/
import java.util.*;
public class Age_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int r=sc.nextInt();
		System.out.println("Enter columns");
		int c=sc.nextInt();
		System.out.println("Enter Ages");
		int ages[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ages[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter cutt-off age");
		int cut_off=sc.nextInt();
		int count=0;
		for(int i=0;i<r;i++)
		{
			int sum=0;
			int total=0;
			for(int j=0;j<c;j++)
			{
				sum+=ages[i][j];
				total++;
			}
			if((sum/total)>cut_off)
			{
				count++;
			}
		}
		System.out.println("count is: "+count);
	}
}

/*

Enter Rows
4
Enter columns
5
Enter Ages
23 34 45 56 67
98 78 65 78 90
85 76 98 1 2
5 6 7 8  9
Enter cutt-off age
25
count is:
3

 */
