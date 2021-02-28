
public class Largest_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		int max_so_far = 0,max_ending_here = 0;
		int start=0,end=0;
		for(int i=0;i<arr.length;i++)
		{
			max_ending_here=max_ending_here+arr[i];
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
				end=i;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
				 start=i+1;
			}
		}
		
		System.out.println("The Sum Of SubArray is "+max_so_far);
		System.out.println("The Start Index Of SubArray is "+start);
		System.out.println("The End Index Of SubArray is "+end);

	}

}
