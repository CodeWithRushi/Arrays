/*
WRITE A PROGRAM TO CALCULATE THE TOTALBILLTAXAMOUNT.
UPTO THE AMOUNT 1000,THERE IS NO TAX APPLICABLE ,SUBSEQUENTLY,
A FLAT TAX OF 10% IS APPLICABLE FOR THE REMAINING AMOUNT AS PER THE TAX RATE
 * */
package Problem_Statment;
import java.util.*;
public class TotalBilltaxAmount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements do you want to imsert");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Tax Rate is: "+calcTotalTax(arr));
	}

	static  int calcTotalTax(int []arr)
	{
		double sum=0;
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]>=1000)
			{
				sum=(arr[i]-1000)*0.10+sum;
				
			}
			i++;
		}
		
		return (int)sum;
	}
}

/*
Enter how many elements do you want to imsert
5
Enter elements
1000
2000
3000
4000
5000
The Tax Rate is: 1000
 */
