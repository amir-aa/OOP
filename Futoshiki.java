
public class cell{
	public int val;
	public boolean fixed;
	public int getValue() {return this.val;}
	public boolean isFixed() {return this.fixed;}
	public void setFix(boolean isfixed) {this.fixed=isfixed;}
	public void setValue(int value) {this.val=value;}
	public cell(int val, boolean fixed) {this.val=val;this.fixed=fixed;}
}
public class FutoshikiRule{
	private cell larger;
	private cell smaller;
	public FutoshikiRule(cell larger,cell smaller) {this.smaller=smaller;this.larger=larger;}
	//public boolean isSmaller() {return this.smaller;}
	public boolean contains(cell cel1,cell cel2)
	{
		
	}
	public boolean isSmaller(cell cel) {if (this.smaller.val<this.larger.val) {return true;} return false;}
	public boolean isSatisfied(cell cel) {
		if (larger.getValue() == 0||smaller.getValue() == 0)
		{return true; //assume true if no value}
			return this.larger.getValue() > this.smaller.getValue();
	}
	
}
}
public class puzzle {

	public static void main(String[] args) {
		// Constructor
		cell c=new cell(2,true);
		
 
	}

}
