/*
 Write a program that takes a string, you should print the first half of the
string and then print the other half in reversed order.
For example: StrangerThings ⇒ StrangersgnihT
 * */
import java.util.*;

public class FlipString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		int half=input.length()/2;
		for(int i=0;i<half;i++) {
			System.out.print(input.charAt(i));
			
		}
		for(int i=0;i<half;i++)
		{
			
			System.out.print(input.charAt(input.length()-1-i));
			
		}
	}

}
