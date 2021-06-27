/*
AUTHOR: RUSHIKESH SHELKE
*/
import java.util.*;
public class Gometric_Progression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Second term");
		double second=sc.nextInt();
		System.out.println("Enter Third term");
		double third=sc.nextInt();
		System.out.println("Enter nth term");
		int n=sc.nextInt();
		System.out.println(nthTerm(second,third,n));
		

	}

	private static double nthTerm(double second, double third, int n) {
		int second_term=2,third_term=3;
		int r=1; //3(third term)-2(second term)=1
		
		double total=(third/second);
		// now r=1 thats why
		r=(int) total;
		int pow1=(int) (n-third_term);
		System.out.println("Output is:");
		return third*Math.pow(r, pow1);
	}

}

/*
 OUTPUT:-
 
Enter Second term
1
Enter Third term
2
Enter nth term
4
Output is:
4.0

Enter Second term
1
Enter Third term
2
Enter nth term
5
Output is:
8.0
 * 
 */
