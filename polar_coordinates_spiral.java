import java.util.*;
public class Problem6 {
	
	    public static void main(String[] args) {
	        double a = 1.2;
	        double b = 0.65;
	        int width = 25;
	        int height = 25;
	        for (int y = height; y >= -height; y--) {
	            for (int x = -width; x <= width; x++) {
	                boolean printed = false;
	                for (double theta=0;theta<=6*Math.PI; theta+=0.01) {
	                    double r = a + b * theta;
	                    double xP = r * Math.cos(theta);
	                    double yP = r * Math.sin(theta);

	                    if (Math.abs(xP-x)<0.5 && Math.abs(yP-y)<0.5) {
	                        System.out.print('x');
	                        printed = true;
	                        break;
	                    }
	                }

	                if (!printed) {
	                    System.out.print(' ');
	                }
	            }
	            System.out.println();
	        }
	    }
	}
