
public class Merge_Two_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {40,50,60,70,80,90};
		int len_a=a.length;
		int len_b=b.length;
		int c1=len_a+len_b;
		int c[]=new int[c1];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[len_a+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
