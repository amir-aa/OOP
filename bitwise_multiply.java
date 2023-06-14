public class bitwise_op {
	
	public final int OPERAND=8;// The operand is constant and it is EVEN
	public static int bitwiseMultiply(int arg)
	{
		int r=arg<<3;// Log8 base2 will result in 3
		return r;
	}
	public static void main(String[] args) {
		
		
		System.out.print(bitwiseMultiply(20));
	}

}
