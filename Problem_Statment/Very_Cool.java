package Problem_Statment;
import java.util.*;
public class Very_Cool {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int K=sc.nextInt();
		int count=0,vcol=0;
		for(int i=1;i<=R;i++)
		{
			count=0;
			String bin="";
			int l=i;
			while(l>0)
			{
				int r=l%2;
				bin=r+bin;
				l=l/2;
			}
			for(int j=0;j<=bin.length()-3;j++)
			{
				if(bin.substring(j, j+3).equals("101"))
				{
					count++;
				}
					
			}
			if(count>=K)
			{
				vcol++;
			}
		}
		System.out.println(vcol);
	}
	
}

/*
102
1

48

21
2

1

 */