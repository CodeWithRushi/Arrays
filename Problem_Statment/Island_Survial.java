package Problem_Statment;
import java.util.*;
public class Island_Survial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int S[]=new int[T];
		int N[]=new int[T];
		int M[]=new int[T];
		int T1[]=new int[T];

		for(int i=0;i<T;i++)
		{
			
			S[i]=sc.nextInt();
			N[i]=sc.nextInt();
			M[i]=sc.nextInt();
		}
		for(int i=0;i<S.length;i++)
		{
			int quentity=(S[i]*M[i])-N[i];
			if(quentity<S[i])
			{
				T1[i]=2;
				
			}
			else
			{
				T1[i]=-1;
				
			}
				
		}
		System.out.println("The Ouput Is");
		for(int j=0;j<T1.length;j++)
		{
			
			System.out.println(T1[j]);
		}
	}

}


/*
2
10 16 2
10 20 30
The Ouput Is
2
-1
 */