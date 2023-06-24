
public class binary_search {
	public static boolean checkArray(int[] myarray,int num) {
		int lasti=myarray.length;
		
		return checkArray(myarray, num, 0, myarray.length-1);
	}
	public static boolean checkArray(int[] myarray,int num, int firstindex,int lastindex) {
		//method overload
		if(firstindex>lastindex)
			return false;
		
		int mid= (firstindex+lastindex)/2;
		if(myarray[mid]==num) {
			return true;
		}
		else if(myarray[mid]<num)
		{
			return checkArray(myarray,num,mid+1,lastindex);
			
		}
		else {
			return checkArray(myarray, num, 0, mid-1);
		}
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,6,7,8,9,10,11,12,13,14,15,16}; //array must be ordered
		System.out.println(checkArray(ar,5));
	}

}
