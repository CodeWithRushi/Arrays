package Problem_Statment;
import java.util.*;
public class GroupAnagrams {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Size");
	int n=sc.nextInt();
	System.out.println("Enter Words");
	String[] words=new String[5];
	
	for(int i=0;i<words.length;i++)
	{
		words[i]=sc.next();
	}
	System.out.println(getGroupedAnagrams(words));
}

	static int getGroupedAnagrams(String[] words) {
		HashMap<String,List<String>> map=new HashMap<>();
		for(String s:words)
		{
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String sort=new String(ch);
			if(!map.containsKey(sort))
			{
				map.put(sort,new ArrayList<>());
			}
			map.get(sort).add(s);
		}
		String[] arr=map.keySet().toArray(new String[0]);
		return arr.length;
	}

}
