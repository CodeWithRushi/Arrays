package Problem_Statment;

import java.util.Scanner;

public class StockManagement_08012022 {

	public static void main(String[] args) {
		int item_Number[]= {101,102,103,104};
		String item_Name[]= {"MILK","CHEESE","GHEE","BREAD"};
		int  price[]= {42,50,500,40};
		int Stock[]= {10,20,15,16};
		
		Scanner sc=new Scanner(System.in);
		
		int it_nu=sc.nextInt();
		int quant=sc.nextInt();
		boolean flag=false;
		int pos=0;
		for(int i=0;i<item_Number.length;i++)
		{
			
			if(item_Number[i]==it_nu)
			{
				flag=true;
				pos=i;
				break;
			}
		}
		if(flag==true)
		{
			if(quant<Stock[pos])
			{
				float pr=(float)price[pos]*quant;
				System.out.println(pr+" INR");
				System.out.println(Stock[pos]-quant+" LEFT");
				
			}
			else
			{
				System.out.println("NO STOCK");
				System.out.println(Stock[pos]+" LEFT");
			}
		}
		else
		{
			System.out.println("Wrong Input");
			
		}
	}

}


/*
OUTPUT:-

101
4
168.0 INR
6 LEFT


104
20
NO STOCK
16 LEFT

105
4
Wrong Input
 */
 
