/* Find Kth Smallest Element in an Array*/



public class SmallestElement {

	public static void main(String[] args) {
		int arr[]= {5,8,12,7,6,2,4};
		
		
		for(int i=0;i<arr.length;i++)
		{	int temp; 
			int min=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			
		}
		for(int i=3;i<4;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
