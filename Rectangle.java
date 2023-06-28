/** A class that represents Rectangle*/

public class Rectangle{

	private int width;
	private int height;
	private char border;

	/** a good constructor*/
	public Rectangle(Rectangle that){
		width = that.width;
		height = that.height;
		border = that.border;

	}
	public Rectangle(int w, int h, char b){
		width =w;
		height = h;
		border = b;
	}

	public Rectangle(int w, int h){
		width =w;
		height = h;
		border = '%';
	}
	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public char getBorder(){
		return border;
	}
	/**some other method*/
	public void setWidth(int width){
		this.width=width;
	}

	public void setHeight(int h){
		height=h;
	}

	public void setBorder(char c){
		border = c;
	}

	public void print(){

		for(int i=0; i<width; i++)
			System.out.print(border);
		System.out.println();

		for(int i=0; i<height-2; i++){
		System.out.print(border);
			for(int j=0; j<width-2; j++)
				System.out.print(" ");
		System.out.println(border);
		}

		for(int i=0; i<width; i++)
			System.out.print(border);
		System.out.println();
	}

	public void printInfo(){
		System.out.println("Height: "+height+", width: "+width+", border: "+border);
	}

	public int area(){
		return height*width;
	}

	public int perimeter(){
		return 2*(height+width);
	}

	public double diagonal(){
		return Math.sqrt(height*height+width*width);
	}

	public static void main(String[] args){
		Rectangle r = new Rectangle(4, 6);
		//r.setWidth(12);
		//r.setHeight(5);
		//r.setBorder('~');

		r.printInfo();
		r.print();
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.diagonal());

		new Rectangle(r).printInfo();

	}


}
