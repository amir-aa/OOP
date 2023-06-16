import java.util.*;
import java.lang.Math;
public class Problem3 {
	public static int Factoriel(int input)
	{
		int temp1=0;
		int temp2=1;
		int result=0;
		for (int i=0;i<input;i++)
		{	
			result=temp1+temp2;
			temp1=temp2;
			temp2=result;//last number
				
			//System.out.println(result);
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Cycle"+i+" Ratio =\t");
			double ratio=(double)Factoriel(n)/Factoriel(n-1);
			System.out.printf("%.4f \n",ratio);
		}
		System.out.println("The GOLDEN NUMBER Real Number is "+(1+Math.sqrt(5))/2);
	}
