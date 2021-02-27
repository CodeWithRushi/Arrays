

/*     METHOD 1:-
 
public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9};
		int Excepted_Element=arr.length+1;
		int total1=0,total2=0;
		for(int i=arr[0];i<=Excepted_Element;i++)
		{
			total1=total1+i;
			
		}
		//System.out.println(total1);
		
		for(int i=0;i<arr.length;i++)
		{
			total2=total2+arr[i];
			
		}
		//System.out.println(total2);
		total2=total1-total2;
		System.out.println("The Missing Element is "+total2);

	}

}

*/


//  METHOD 2
public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8,9};
		int Excepted_Element=arr.length+1;
		int total1=0,total2=0;
		total1=(Excepted_Element*(Excepted_Element+1))/2;             // BY USING FORMULA
		for(int i=0;i<arr.length;i++)
		{
			total2=total2+arr[i];
			
		}
		//System.out.println(total2);
		total2=total1-total2;
		System.out.println("The Missing Element is "+total2);

	}

}
