
/*
 GIVEN A NUMBER N AND ANOTHER NUMBER K.FIND THE  LAST DIGIT OF THE 
 NUMBER FORMED WHEN N IS RAISED TO THE POWEER OF K
 * */
import java.util.*;
public class MBA_CHALLANGE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter no");
		int n=sc.nextInt();
    System.out.println("Enter power");
		int k=sc.nextInt();
		System.out.println(lastdigit(n,k));
    System.out.println("last digit is");
		System.out.println(lastdigit(n,k)%10);
	}

	static int lastdigit(int n,int k)
	{
		int p=1;
		while(k>0)
		{
			p=p*n;
			k--;
		}
		return p;
			
			
		
	}
}

/*
Enter no
5
Enter power
5
3125
last digit is
5
*/
