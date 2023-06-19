/*
After the long preparation, you are finally wring the OOP exam and
want to communicate with your friend. You don’t want to be caught by the proctors, so you write
your messages on a paper using the following encryption scheme:
(a) You write your message as a single sentence using lowercase English letters, and space char-
acters (no other symbols are allowed). The sentence should consist of at least two words.
(b) You replace the spaces with character ‘#’.
(c) You choose two integer values a and b (a ∈ [1, 5], b ∈ [1, 10]) and replace each letter with the
one that comes ab letters after it. Please note that ‘a’ comes after ‘z’.
(d) You pass the paper to your friend and also provide the a and b values so that they can decrypt
your message.
*/
import java.util.*;
public class Problem4 {
	public static String dec(String PlainText,int a, int b) {
		PlainText= PlainText.replace('#', ' ');
		String ciphertxt="";
		
		for(int i=0;i<PlainText.length();i++) {
			if(PlainText.charAt(i)==' ')
				ciphertxt+=' ';
			else {
			int temp=(int)PlainText.charAt(i)-(int)Math.pow(a, b);//97-122 lower case chars in ASCII table
			
			while (temp<97)
			{
				
				temp=96-temp;
				temp=122-temp;
			}
			ciphertxt+=(char)temp;
			}
		}
		
		return ciphertxt;
	}
public static String enc(String PlainText,int a, int b) {
	PlainText= PlainText.replace(' ', '#');
	String ciphertxt="";
	
	for(int i=0;i<PlainText.length();i++) {
		if(PlainText.charAt(i)=='#')
			ciphertxt+='#';
		else {
		int temp=(int)PlainText.charAt(i)+(int)Math.pow(a, b);//97-122 lower case chars in ASCII table
		//System.out.println(temp);
		while (temp>122)
		{
			
			temp=temp-122;
	
			temp+=96;
		}
		ciphertxt+=(char)temp;
		}
	}
	
	return ciphertxt;
}
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Give Me the Plain Text:");
	 String PlainText=s.nextLine();
	 PlainText=PlainText.toLowerCase();//change all capital letters to Lower case
	 System.out.println("Give Me a Value:");
	 int a=s.nextInt();
	 System.out.println("Give Me b Value:");
	 int b=s.nextInt();
	 System.out.println(PlainText);
	 String Cipher=enc(PlainText,a,b);
	System.out.println(Cipher);
	System.out.println(dec(Cipher,a,b));
	}

}
