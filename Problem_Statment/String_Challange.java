/*
@AUTHOR:- RUSHIKESH SHELKE

HAVE THE FUNCTION LongstWorld() TAKE THE STRING PARAMETER BEING PASSED AND DISPLAY THE LONGEST WORD IN THE TRING


 * */
import java.util.*;
public class String_Challange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String");
		String st=sc.nextLine();
		LongstWorld(st);
	}
	public static void LongstWorld(String st) {
	{
		String str[]=st.split("\\s");
		int len=0;
		String long1="";
		for(String st1:str)
		{
			char ch[]=st1.toCharArray();
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>='A' && ch[j]<='Z' || ch[j]>='a' && ch[j]<='z' )
				{
					count++;
				}
			}
			
			if(len<count)
			{
				len=count;
				long1=st1;
			}
		}
		System.out.println("The Longest Length of a word is: ");
		System.out.println(long1);
			
	}
}
}

/**
OUTPUT:- 
 
ENter String
fun&!! time
The Longest Length of a word is: 
time

ENter String
I LOVE YOU
The Longest Length of a word is: 
LOVE
 */
