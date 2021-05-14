/*
GIVEN THE LENGTH OF WORD AND THE MAXIMUM NUMBER OF CONSECUTIVE VOWELS THAT IT CAN CONTAIN,
DETERMINE HOW MANY UNIQUE WORDS CAN BE GENERATED.
WORDS WILL CONSIST OF ENGLISH ALPHABETIC LETTERS A THROUGH Z ONLY.
VOWELS ARE V{A,E,I,O,U};CONSONANTS AR C THE REMAINING 21 LETTERS.

RESULT=FIND HOW MANY WAYS?
 * */

import java.util.*;
public class String_Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wordLength");
		int w=sc.nextInt();
		System.out.println("Enter MaxVowels");
		int v=sc.nextInt();
		System.out.println(calculateways(w,v));

	}

	static int calculateways(int w,int v)
	{
		int sum=power(w);
		
		int vo=5;
		while(v>0)
		{
			sum+=w*(power(w-1))*vo;
			vo=vo*5;
			v--;
			w--;
		}
		return sum;
	}
	static int power(int n)
	{
		int sum1=1;
		do
		{
			sum1=sum1*21;
			n--;
		}while(n>0);
		return sum1;
	}
	
}

/*
Enter wordLength
2
Enter MaxVowels
1
651


Enter wordLength
4
Enter MaxVowels
2
412776
 * */
