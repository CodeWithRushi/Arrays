package Problem_Statment;
import java.util.*;
public class SpecialTwoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int N=sc.nextInt();
		boolean result=specialDigit(N);
		if(result==true)
		{
			System.out.println(N+" is  Special Two Digit Number");
		}
		else
		{
			System.out.println(N+" is Not a Special Two Digit Number");
		}
		

	}
	static boolean specialDigit(int n)
	{
		if(n>9 && n<=99 ||n>=-99 && n<=-10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
