/*
 * N NUMBER OF PEOPLE PARTICIPATED IN A CODEING MARATHON WHERE THEY WERE ASKED TO SOLVE SOME 
 * PROBLEM.EACH PROBLEM CARRIED 1 MARK AND AT THE END OF THE MARATHON,THE TOTAL MARKS THAT
 * EACH PERSON ACHIEVED WAS CALCULATED
 * */

package Problem_Statment;
import java.util.*;
public class CoadingMarathon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Participates");
		int N=sc.nextInt();											//Total_Participates
		System.out.println("Enter Top Scores");
		int K=sc.nextInt();											//Top Score
		System.out.println("Enter Participants Score");
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(marathon(N,K,arr));
	}
	static int marathon(int n,int k,int[] arr)
	{
		Arrays.sort(arr);
		
		int sum=0;
		for(int i=arr.length-k;i<arr.length;i++)
		{
			if(k>0)
			{
				sum+=arr[i];
				k--;
				
			}
		}
		return sum;
	}

}

/*
Enter Total Participates
4
Enter Top Scores
2
Enter Participants Score
4
1
2
5
9
 * */
