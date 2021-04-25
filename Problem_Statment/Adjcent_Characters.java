/*
WAP TO COMPUTE ANEW STRING WHERE IDENTICAL CHARS THAT ARE ADJACENT IN THE ORIGINAL STRING SEPARATED FRROM EACH OTHER BY A "*"
*/
import java.util.*;
public class Adjcent_Characters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		String adj="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0||i!=str.length() && str.charAt(i)!=str.charAt(i-1))
			{
				adj+=str.charAt(i);
			}
			if(i!=str.length() && i!=0 && str.charAt(i)==str.charAt(i-1))
			{
					adj+="*"+str.charAt(i);
			}
			
			
		}
		System.out.println("The Output is "+adj);
	}

}

/*
Enter String
aaabbb
The Output is a*a*ab*b*b

Enter String
hello
The Output is hel*lo

 */
