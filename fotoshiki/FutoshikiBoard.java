package Problem1;



public class FutoshikiBoard {
	public static FutoshikiRule[] createRules(int[][] rulesMatrix,cell[][] grid) {
	    int numRows = rulesMatrix.length;
	    FutoshikiRule[] rules=new FutoshikiRule[numRows];

	    for (int i = 0; i < numRows; i++) {
	        int smallerRow=rulesMatrix[i][0];
	        int smallerCol=rulesMatrix[i][1];
	        int largerRow=rulesMatrix[i][2];
	        int largerCol=rulesMatrix[i][3];
	        cell smaller=grid[smallerRow][smallerCol];
	        cell larger=grid[largerRow][largerCol];

	        FutoshikiRule rule = new FutoshikiRule(smaller,larger);
	        rules[i] = rule;
	    }

	    return rules;
	}

	
private int Size;
private cell grid[][];
private FutoshikiRule[] rule;
private int[][] temp;
public FutoshikiBoard(int size) {
	this.Size=size;
	this.grid=new cell[size][size];//instance of 2d array
	this.rule=new FutoshikiRule[size];//assuming number of rules for each cell
	
}





public FutoshikiBoard(int[][] init,int[][] rules) {
	Size= init.length;
	this.grid=new cell[Size][Size];
	
	
	
	 for(int i =0;i<Size;i++) 
	 {
         for(int j=0;j<Size;j++) {
        	 boolean isFix=(init[i][j]!=0);
        	 this.grid[i][j] = new cell(init[i][j],isFix);
        	 
         }
     }
	 this.rule=createRules(rules, this.grid); //assign all rules to Rule object
	 this.temp=rules;//to check for the symbols
}
public int getSize() {return this.grid.length;}
public cell getCell(int i, int j) {return this.grid[i][j];}
public void print() {
	

	int sym=0;//to store symbols between lines
	for(int i=0;i<this.grid.length;i++)
	{
		if(sym!=0)
		{for(int z=0;z<Math.abs(sym);z++) {System.out.print("\t");}
		
		if(sym<0)
			System.out.print("V");
		else {System.out.print("^");}
		
		
	sym=0;
		}
	System.out.println();//to provide 1line empty after each one
		for(int j=0;j<this.grid[0].length;j++)
		{
			int val=this.grid[i][j].getValue();
			System.out.print(val);
			for(int[] item:temp) {if(i==item[0]&&j==item[1]) {
				if(item[2]==item[0] && item[1]<item[3])
					System.out.print("<");
			//in a row and smaller is first
				else if(item[2]==item[0] && item[1]>item[3])
					System.out.print(">");//in a row and larger is first
			else if(item[0]<item[2]) {sym=item[3];}//SYMBOL ^ :: symbol between current and next row so we store in sym variable
			else {sym=-item[3];} //SYMBOL V - represents top row is larger
			}
			}
			System.out.print("\t");	
			

		}
		System.out.println();
	}
	
	
	}
}
