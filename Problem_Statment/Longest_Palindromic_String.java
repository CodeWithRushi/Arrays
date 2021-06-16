/*
@author Rushikesh Shelke
Problem Statment:
				Given a string, find the longest substring which is palindrome. 
 * */
import java.util.*;
public class Longest_Palindromic_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		int start=0,end=0,len=1;
		
		/* EVEN LENGTH*/
		if(str.length()%2==0)
		{
			
			for(int i=0;i<str.length();i++)
			{
				int l=i;
				int h=i+1;
				
				while(l>=0 && h<str.length() && str.charAt(l)==str.charAt(h))
				{
					if(h-l+1>len)
					{
						start=l;
						end=h+1;
						len=h-l+1;
					}
					l--;
					h++;
				}
			}
			System.out.println(str.substring(start,end));
		}
		/* ODD LENGTH*/
		else
		{
			
			start=0;end=0;len=1;
			for(int i=0;i<str.length();i++)
			{
				
				
				int l=i;
				int h=i+1;
				
				if(l>=0 && h<str.length() && str.charAt(l)==str.charAt(h))
				{
					while(l>=0 && h<str.length() && str.charAt(l)==str.charAt(h))
					{
						if(h-l+1>len)
						{
							start=l;
							end=h+1;
							len=h-l+1;
						}
						l--;
						h++;
					}
				}
				else
				{
					h=h+1;
					while(l>=0 && h<str.length() && str.charAt(l)==str.charAt(h))
					{
						if(h-l+1>len)
						{
							start=l;
							end=h+1;
							len=h-l+1;
						}
						l--;
						h++;
					}
				}
				
			}
				
			System.out.println(str.substring(start,end));
		}
		
		
	}
		
}

/*
 OUTPUT:
 
Enter String 
forgeeksskeegfor
geeksskeeg

Enter String 
Geeks
ee

Enter String 
aaaabbaa
aabbaa

Enter String 
cbabd
bab
 */
