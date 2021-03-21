package Problem_Statment;
import java.util.*;
public class greatestMiddle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want Enter");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		Arrays.sort(arr);
		for(int j=1;j<n;j=j+2)
		{
			System.out.print(arr[j]+",");
		}
		for(int k=n-1;k>=0;k=k-2)
		{	
			System.out.print(arr[k]+",");
		}
	}
}

