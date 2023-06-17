import java.util.*;
public class years {

	public static void main(String[] args) {
		System.out.println("Give me the year");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		if(year%4==0 && year%100!=0|| year%400==0)
		{
			System.out.println("A leap year!");}
		else 
		{
			System.out.println("Not Leap");
		}

	}

}
