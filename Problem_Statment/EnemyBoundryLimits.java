package Problem_Statment;
import java.util.*;
public class EnemyBoundryLimits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Number of Enemy Country");
		int c=sc.nextInt();
		int arr[][]=new int[c][];
		
		for(int i=0;i<c;i++)
		{
			int villege=sc.nextInt();
			arr[i]=new int[villege];
		}
		
		for(int i=0;i<c;i++)
		{
			
			
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();	
				
			}
			
		}
		
		for(int i=0;i<c;i++)
		{
			int last=0;
			int j=0;
			
				last=arr[i].length;
				if(arr[i].length==1)
				{
					System.out.println(arr[i][0]);
				}
				else
				{
					System.out.println(arr[i][0]+" "+arr[i][last-1]);
				}
				
				
			
			
		}
	}

}
