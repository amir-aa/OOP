import java.util.Scanner;

public class cl1 {

	public static void main(String[] args) {
		 Scanner n=new Scanner(System.in);
	      System.out.println("Enter the strips:");
	      int num=n.nextInt();
	      System.out.println("Enter the Width:");
	      int w=n.nextInt();

	      int sumarea=(num * (num + 1) / 2) * w;
	      System.out.println(sumarea);
	}

}
