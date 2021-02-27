
/*  WAP TO Find Kth  Largest Element In Array*/


public class LargestElement {

	public static void main(String[] args) {
		int arr[]= {5,8,12,7,6,2,4};
		
		
		for(int i=0;i<arr.length;i++)
		{	int temp; 
			int max=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[max]<arr[j])
				{
					max=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[max];						
			arr[max]=temp;
			
			
		}
		for(int i=3;i<4;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
