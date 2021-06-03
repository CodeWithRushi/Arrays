/*
INPUT FORMAT:-
  The First line of input contains the number of test-cases
  The first line of each test-case contains the size of array(N)
  the second line of each test-case will contain N space-separated positive integer values.
  
 OUTPUT FORMAT:
  For each test at new line print the 1 based index of number that
  differs from other in form of evenness.
*/
import java.util.*;
public class The_Test_IQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.pf TestCases");
		int n=sc.nextInt();
		int arr[][]=new int[n][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enetr Size");
			int s=sc.nextInt();
			arr[i]=new int[s];
			System.out.println("Enter Values");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int ecount=0,ocount=0,epos=0,opos = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0)
				{
					ecount++;
					epos=j;
				}
				else
				{
					ocount++;
					opos=j;
				}
			}
			
			if(ecount==1)
				
				System.out.println("Index is: "+epos+1);
			else
				System.out.println("Index is: "+opos+1);
		}

	}

}


/*
OUTPUT IS:

Enter No.pf TestCases
2
Enetr Size
6
Enter Values
4 6 90 2 1 78
Enetr Size
4
Enter Values
2 1 67 47

Index is: 5
Index is: 1
 * */
 */
