package linepoint;
public class line{
	private point start;
	private point end;
	public line(double x1,double x2,double y1, double y2) {
		this.start=new point(x1,y1);
		this.end=new point(x2,y2); 
	}
	public line(point start,point end) {
		this.start=new point(start);
		this.end=new point(end);
		
	}
	public double getXstart() {return this.start.getX();}
	public double getYstart() {return this.start.getY();}
	public double getXend() {return this.end.getX();}
	public double getYend() {return this.end.getY();}
	public void setStart(point start) {
		this.start=start;
		
	}
	public void setEnd(point end) {
		this.end=end;
		
	}
	public double getLength() {return Math.sqrt(Math.pow(this.getXstart()- getXend(),2)+,Math.pow(this.getYstart()- this.getYend(),2)));}
}
public class point {
	
	private double x;
	private double y;
	public point() {
		
		this.x=0;
		this.y=0;
	}
	public point()(double x,double y) {
		this.x=x;
		this.y=y;
		
	}
	public point(point that) {
		this.x=that.x;
		this.y=that.y;
		
	}
	
	public double getY() {return this.y;}
	public double getX() {return this.x;}
	public void setX(double x) {this.x=x;}
	public void setY(double y) {this.y=y;}
	public double[] getXY(){return {this.x,this.y};}
}

	public static void main(String[] args) {
		

	}

}
