
/*
FOR A GIVEN STRING AND GIVEN VALUES OF M AND N,
FIND THE NUMBER OF TURNS IN WHICH THEY WILL GET THE ORIGINAL WORD STRING BACK
 * */
import java.util.*;
public class Cut_Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println("Enetr M value ");
		int M=sc.nextInt();
		System.out.println("Enetr N value ");
		int N=sc.nextInt();
		System.out.println("The Result is:");
		System.out.println(cout_trav(str,M,N));
	}
	static int cout_trav( String str,int m,int n)
	{
		boolean flag=false;
		String dec="";
		int count=0;
		String org=str;
		while(flag==false)
		{
			if(dec.equals(org))
			{	flag=true;
				break;}
			else
			{
				dec="";
				for(int i=str.length()-1;i>str.length()-m-1;i--)
				{
					dec+=str.charAt(i);
				}
				for(int j=0;j<str.length()-m;j++)
				{
					dec+=str.charAt(j);
				}
				count++;
			}
			
			if(dec.equals(org))
			{	flag=true;
				break;}
			else
			{
				String new1="";
				for(int i=dec.length()-1;i>dec.length()-n-1;i--)
				{
					new1+=dec.charAt(i);
				}
				for(int j=0;j<dec.length()-n;j++)
				{
					new1=dec.charAt(j)+new1;
				}
				count++;
				dec=new1;
				str=dec;
			}
			
		}
		if(flag==true)
			return count;
		else
			return 0;
	}
}

/*
Enter String
AbcDef
Enetr M value 
1
Enetr N value 
2
The Result is:
4
 * */
