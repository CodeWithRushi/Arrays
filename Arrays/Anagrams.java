import java.util.*;
public class Anagrams {

	boolean isAnagram(char[] ch1,char[] ch2)
	{
		if(ch1.length!=ch2.length)
		{
			return false;
		}
		/*													//USING FOR LOOP
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				return false;
			
		}
		return true;
		*/
		
		
		if(Arrays.equals(ch1, ch2))							//USING EQUALS METHOD
			return true;
					
		return false;
	}
	public static void main(String[] args) {
		Anagrams ag=new Anagrams();
		Scanner sc=new Scanner(System.in);
		
		String s1 =sc.nextLine();
		String s2 =sc.nextLine();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ag.isAnagram(ch1,ch2))
		{
			System.out.println("The "+s1+" and  "+s2+" are Anagrams");
		}
		else
		{
			System.out.println("The "+s1+" and  "+s2+" are not Anagrams");
		}
		
		
		}

}
