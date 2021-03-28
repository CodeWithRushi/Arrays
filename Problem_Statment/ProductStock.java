/*
 * USER ENTER ITEM NO AND QUENTITY AND DISPLAY THE STOCK REPORT AND THE STOCK IS LESS THAN QUENTITY THEN DISPLAY "NO STOCK" 
 * AND THE USER INPUT WRONG ITEM NO THEN DISPLAY "INVALID INPUT".
 * */package Problem_Statment;
import java.util.*;
public class ProductStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item Number");
		int item_num=sc.nextInt();
		System.out.println("Enter Quantity");
		int quentity=sc.nextInt();
		int item[]= {101,102,103,104};
		String[] item_name= {"Milk","Cheese","Ghee","Bread"};
		int[] price= {42,50,500,40};
		int[] stock= {10,20,15,16};
		
		int i=0;
		boolean flag=true;
		while(i<item.length)
		{
			if(item_num==item[i])
			{
				if(quentity<stock[i])
				{
					
					System.out.println(String.format("%.1f",(float)price[i]*quentity)+" "+"INR");
					System.out.println(stock[i]-quentity+" "+"LEFT");
				}
				else
				{
					System.out.println("No Stock");
					System.out.println(stock[i]+" "+"LEFT");
				}
				flag=false;
			}
			i++;
		}
		if(flag==true)
			System.out.println("Invalid Input");
	}
	

}

/*
  
Enter Item Number
105
Enter Quantity
6
Invalid Input

Enter Item Number
101
Enter Quantity
4
168.0 INR
6 LEFT

Enter Item Number
104
Enter Quantity
20
No Stock
16 LEFT
*/
