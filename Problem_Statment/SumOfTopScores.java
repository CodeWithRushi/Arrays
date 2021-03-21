package Problem_Statment;
import java.util.*;
public class SumOfTopScores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to enter");
		int n=sc.nextInt();
		System.out.println("How many Top elements do you want to perform operation");
		int top=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		System.out.println(arr[arr.length-1]+arr[arr.length-2]);
		
		/*
		for(int i=0;i<arr.length;i++)
		{	int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp;
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		*/
		
		
		
	}

}
