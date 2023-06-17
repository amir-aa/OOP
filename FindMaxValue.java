
import java.util.*;
public class findmax {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextInt()){
			int num=scan.nextInt();
			if (num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			
			
		}
		System.out.println(max);

	}

}
