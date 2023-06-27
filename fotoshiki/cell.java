
public class cell{
	public int val;
	public boolean fixed;
	public int getValue() {return this.val;}
	public boolean isFixed() {return this.fixed;}
	public void setFix(boolean isfixed) {this.fixed=isfixed;}
	public void setValue(int value) {this.val=value;}
	public cell(int val, boolean fixed) {this.val=val;this.fixed=fixed;}
}
