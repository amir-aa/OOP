
import java.util.Scanner;

public class rectangles {

	public static void main(String[] args) {
		 Scanner n=new Scanner(System.in);
	      System.out.println("Enter the strips:");
	      int num=n.nextInt();
	      System.out.println("Enter the Width:");
	      int w=n.nextInt();
int sumArea=0;
for(int i=1;i<=num;i++)
{
	int height=i;
	sumArea+=(height*w);
}

	     System.out.println(sumArea);
	     
	}

}
