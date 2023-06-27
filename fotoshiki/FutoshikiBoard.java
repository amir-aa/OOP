package Problem1;

public class FutoshikiBoard {
private int Size;
private cell grid[][];
private FutoshikiRule[] rule;
public FutoshikiBoard(int size) {
	this.Size=size;
	this.grid=new cell[size][size];//instance of 2d array
	this.rule=new FutoshikiRule[size];//assuming number of rules for each cell
	
}
public FutoshikiBoard(int[][] init,int[][] rules) {
	Size= grid.length;
	
	 for(int i =0;i<Size;i++) 
	 {
         for(int j=0;j<Size;j++) {
        	 boolean isFix=(init[i][j]!=0);
        	 grid[i][j] = new cell(init[i][j],isFix);
         }
     }
}
public int getSize() {return this.grid.length;}
public cell getCell(int i, int j) {return this.grid[i][j];}

}
