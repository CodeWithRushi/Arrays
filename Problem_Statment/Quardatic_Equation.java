package Problem_Statment;
import java.util.*;
public class Quardatic_Equation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double input1=sc.nextDouble();
		double input2=sc.nextDouble();
		double input3=sc.nextDouble();
		
		double[] root=findroots(input1,input2,input3);
		System.out.println(root[0]+" "+root[1]);
		

	}

	static double[] findroots(double input1,double input2,double input3)
	{
		double a[] = new double[2];
		
		double determinant=(input2*input2)-4*(input1*input3);
		double sqrt=Math.sqrt(determinant);
		System.out.println(determinant);
		
		if(determinant>0)
		{
			double first_root=(-input2+sqrt)/(2*input1);
			double second_root=(-input2-sqrt)/(2*input1);
			a[0]=first_root;
			a[1]=second_root;
		}
		else if(determinant == 0){
	         System.out.println("Root is :: "+(-input2 + sqrt)/(2*input1));
	      }
			
		
		/*
		double determinant = (input2*input2)-(4*input1*input3);
	      double sqrt = Math.sqrt(determinant);

	      if(determinant>0){
	         Object firstRoot = (-input2 + sqrt)/(2*input1);
	         Object secondRoot = (-input2 - sqrt)/(2*input1);
	         System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
	      }else if(determinant == 0){
	         System.out.println("Root is :: "+(-input2 + sqrt)/(2*input1));
	      }*/
		return a;
		
	}
}
