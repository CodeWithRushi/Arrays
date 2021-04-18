/*
@author Rushikesh Shelke

Roots of a quadratic equation are determined by the following formula:


To calculate the roots −

Calculate the determinant value (b*b)-(4*a*c).
If determinant is greater than 0 roots are [-b +squareroot(determinant)]/2*a and [-b -squareroot(determinant)]/2*a.
If determinant is equal to 0 root value is (-b+Math.sqrt(d))/(2*a)
*/
import java.util.*;
public class Quardatic_Equation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double input1=sc.nextDouble();
		double input2=sc.nextDouble();
		double input3=sc.nextDouble();
		
		double[] root=findroots(input1,input2,input3);
		System.out.println(String.format("%.3f", root[0])+" "+String.format("%.3f", root[1]));
		


	}

	static double[] findroots(double input1,double input2,double input3)
	{
		double a[] = new double[2];
		
		double determinant=(input2*input2)-4*(input1*input3);
		double sqrt=Math.sqrt(determinant);
		double first_root=(-input2+sqrt)/(2*input1);
		double second_root=(-input2-sqrt)/(2*input1);
		a[0]=first_root;
		a[1]=second_root;
		return a;
		
	}
}

/*
2
4
1

-0.293 -1.707
*/
