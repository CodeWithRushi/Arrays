package Problem_Statment;
import java.util.*;
import java.util.regex.Pattern;
public class HowManyWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		System.out.println(howMany(str));
		
	}
	
	static int howMany( String str)
	{
		String[] words = str.split("[\\s,.?!0\\d]+");
		for(String s:words)
			System.out.println(s);
		return words.length;
	}
	

}
