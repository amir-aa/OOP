
public class area {
	static int sumArea=0;
	static int i=1;
	public static int recursive_rect(int n,int w)
	{
		
		sumArea+=i*w;
		i++;
		//System.out.println(sumArea);
		if(i<=n)
			recursive_rect(n, w);
		return sumArea;
	}
	public static void main(String[] args) {
		
		System.out.println(recursive_rect(2, 5));
	}

}
