/**
 * @author Rushikesh Shelke
 * 
 *         For a number X, let its "Coolness" be defined as the number of "101"s
 *         occurring in its binary representation. For example, the number 21
 *         has Coolness 2, since its binary representation is 101012, and the
 *         string "101" occurs twice in this representation.
 * 
 *         A number is defined as Very Cool if its Coolness is greater than or
 *         equal to K. Please, output the number of Very Cool integers between 1
 *         and R.
 * 
 *         Input: The first line contains an integer T, the number of test
 *         cases. The next T lines contains two space-separated integers, R and
 *         K. Output: Output T lines, the answer for each test case.
 * 
 */
import java.util.*;
public class Very_Cool {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int K=sc.nextInt();
		int count=0,vcol=0;
		for(int i=1;i<=R;i++)
		{
			count=0;
			String bin="";
			int l=i;
			while(l>0)
			{
				int r=l%2;
				bin=r+bin;
				l=l/2;
			}
			for(int j=0;j<=bin.length()-3;j++)
			{
				if(bin.substring(j, j+3).equals("101"))
				{
					count++;
				}
					
			}
			if(count>=K)
			{
				vcol++;
			}
		}
		System.out.println("count of very Cool Number is "+vcol);
	}
	
}

/*
102
1
count of very Cool Number is:-
48

21
2
"count of very Cool Number is:-
1

 */
