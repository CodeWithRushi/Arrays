package Problem_Statment;
import java.util.*;
public class SimpleCipher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter Counter");
		int k=sc.nextInt();
		System.out.println("The Original String is "+str+" And The Decrypted String is "+isDecrypt(str,k));
		
		

	}

	static String isDecrypt(String s, int k)
	{
		String decrypt="";
		char[] chars = s.toCharArray();
		for(char c : chars)
		{
			
			int value=(int)c;
			if(value==65)
			{
				value=90-(k-1);
			}
			else
			{
				value=value-k;
			}
			
			
			decrypt+=(char)(value);
			
		}
		return decrypt;
	}
}
