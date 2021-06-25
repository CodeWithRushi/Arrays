/*
 @AUTHOR :- RUSHIKESH SHELKE
 
 PROBLEM STATMENT:-
 
 Natural Language Understanding is the subdomain of Natural Language Processing where people used to design AI based applications have ability to understand the human languages. 
 HashInclude Speech Processing team has a project named Virtual Assistant. 
 For this project they appointed you as a data engineer (who has good knowledge of creating clean datasets by writing efficient code).
 As a data engineer your first task is to make vowel recognition dataset. 
 In this task you have to find the presence of vowels in all possible substrings of the given string.
 For each given string you have to print the total number of vowels.

Input

First line contains an integer T, denoting the number of test cases.

Each of the next lines contains a string, string contains both lower case and upper case .

Output

Print the vowel sum
Answer for each test case should be printed in a new line.


SAMPLE INPUT 
1
baceb
SAMPLE OUTPUT 
16



 * */
import java.util.*;
public class Vowel_Recognization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Test Cases");
		int t=sc.nextInt();
		String str[]=new String[t];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		int count[]=new int[t];
		int size=0;
		char vowels[]= {'a','A','e','E','i','I','o','O','u','U'};
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				for(int k=j;k<str[i].length();k++)
				{
					String st=str[i].substring(j,k+1);
					char ch[]=st.toCharArray();
					for(char ch1:ch)
					{
						for(char v:vowels)
						{
							if(v==ch1)
							{
								size++;
							}
						}
					}
					
				}
				
			}
			count[i]=size;
			size=0;
		}
		for(int i:count)
		{
			System.out.println(i);
		}
		
	}

}

/*
OUTPUT:-

Enter No of Test Cases
1
baceb
16

 * 
 */
