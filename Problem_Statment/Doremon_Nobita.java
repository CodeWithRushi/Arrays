/*
@AUTHOR:- RUSHIKESH SHELKE
PROBLEM STATMENT:-

Doraemon lends Nobita a computer pencil which writes all the answers to his homework. Gian steals it and uses it in an exam to get 100% help Nobita answer a question so that he can pass his exam. The question is to find the smallest number with given digit sum "s" and number of digits "d"? 
Input: The first line contains value of s The second line contains value of d 

Output: Print the smallest number. If there is no solution then asplay Not possible" 

EXPLANATION: SUM=9,DIGIT=2, OUTPUT=18(MINIMUM)[1+8=9]
 * */

package Problem_Statment;
import java.util.*;
public class Doremon_Nobita {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER  VALUE OF S");
		int s=sc.nextInt();
		System.out.println("ENTER  VALUE OF D");
		int d=sc.nextInt();
		String small="";
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j==s)
				{
					small+=i;
					small+=j;
					System.out.println("Result is: ");
					System.out.println(small);
					break;
				}
			}
			break;
		}
	}

}

/*
OUTPUT:-

ENTER  VALUE OF S
9
ENTER  VALUE OF D
2
Result is: 
18
 * */
