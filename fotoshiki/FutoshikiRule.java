package Problem1;
public class FutoshikiRule{
	private cell larger;
	private cell smaller;
	public boolean contains(cell cellToCheck) {return cellToCheck.equals(larger)||cellToCheck.equals(smaller);}
	public boolean contains(cell cel1,cell cel2)
	{
		return contains(cel1)&&contains(cel2);
	}
	public boolean isSmaller(cell cel) {if (this.smaller.val<this.larger.val) {return true;} return false;}
	public boolean isSatisfied(cell cel) {
		if (larger.getValue()==0||smaller.getValue()==0)
			return true; //assume true if no value}
		
		return this.larger.getValue()> this.smaller.getValue();//it is true if the values are in the correct situation
			
	
}
	public FutoshikiRule(cell larger,cell smaller) {this.smaller=smaller;this.larger=larger;}
	//public boolean isSmaller() {return this.smaller;}

}