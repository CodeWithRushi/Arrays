package Problem_Statment;
import java.util.*;
/*
public class StringDecrypt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String[] words=str.split("\\s");
		
		char[] ch1=words[0].toCharArray();
		char[] ch2=words[1].toCharArray();
		String Decrypt="";
		int n=ch1.length+ch2.length;
		int second_Array_Start_position=0;
		for(int i=0;i<n;i++)
		{
			if(i<ch1.length)
				Decrypt+=ch1[i];
			if(second_Array_Start_position<ch2.length)
				Decrypt+=ch2[i];
				second_Array_Start_position++;
			
		}
		System.out.println(Decrypt);
*/		
		
//-------------------------------------------------------------------------------------------------------------------------------

public class StringDecrypt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String[] words=str.split("\\s");
		String Decrypt="";
		int n=0;
		for(int i=0;i<words.length;i++)
		{
			n+=words[i].length();
		}
		int counter=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(counter<words[j].length())
					Decrypt+=words[j].charAt(i);
			}	
			counter++;
		}
		System.out.println(Decrypt);
}	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
public class StringDecrypt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String str2 ="";
		String str1 ="";
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				str1+=ch[i];
			}
			else
			{
				str2+=ch[i];
			}
		}
			
			 
		System.out.println(str1+" "+str2);
		

	}

}
*/