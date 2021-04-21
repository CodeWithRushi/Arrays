package Problem_Statment;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char ch[]=str1.toCharArray();
		String decrypt="";
		for(int i=0;i<ch.length;i++)
		{
			decrypt+=ch[i];
			System.out.println(decrypt);
			if(i==ch.length-1)
			{
				int k=1;
				
				
				while(k<=ch.length)
				{
					decrypt="";
					for(int j=k;j<ch.length;j++)
					{
						decrypt+=ch[j];
					}
					System.out.println(decrypt);
					k++;
				}
				
			}
		}
		
		
		
	}
	
}	
	
/*
sending
s
se
sen
send
sendi
sendin
sending
ending
nding
ding
ing
ng
g



84887329
8
84
848
8488
84887
848873
8488732
84887329
4887329
887329
87329
7329
329
29
9
 * */
	
	
	
	
	
	
	
	
	
/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		int temp=num[0];
		for(int i=0;i<num.length;i++)
		{
			
			if(temp<num[i])
			{
				temp=num[i];
			}
		}
		System.out.println(temp);
	}

}*/
