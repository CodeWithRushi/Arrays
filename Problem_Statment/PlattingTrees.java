/*
 * IN A PARTICULAR FIELD,THERE ARE TREES IN A SINGLE ROW FROM LEFT TO RIGHT.EACH TREE HAS a value V.
 * YOU CUT TREES FROM LEFT TO RIGHT AND EACH TREE OF VALUE V THAT YOU CUT,YOU PLANT(V+1)%((V+1)%M)-1
 * */
package Problem_Statment;
import java.util.*;
public class PlattingTrees {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Trees");
		int K=sc.nextInt();									//Number of Trees
		System.out.println("Enter Modulus Value");
		int M=sc.nextInt();									//Number of Trees
		System.out.println(totalTrees(K,M));
	}
	static int totalTrees(int k,int m)
	{
		return (2+k)%m;
	}
}


/*
Enter No.of Trees
1
Enter Modulus Value
5
3
 * */
 
