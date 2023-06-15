public class bitwise_swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("A is "+a+" B is "+ b);
		b=a^b;
		a=a^b;
		b=a^b;
		System.out.print("New value for A:"+a+"\n"+"New Value for B:"+b);


	}

}
