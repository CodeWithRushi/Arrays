package Problem_Statment;
import java.util.*;
public class FindDiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int l=sc.nextInt();
		
		int result=getDiscount(l);
		System.out.println("The Discount is "+result);
		

	}
	static int getDiscount(int ordervalue)
	{
		int answer=0;
		
		do {
			int r=ordervalue%10;
			if(r==2||r==3||r==5||r==7)
			{
				answer+=r;
			}
			ordervalue=ordervalue/10;
			
		   }while(ordervalue>0);
		return answer;
		
	}

}
