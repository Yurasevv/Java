package erat;

public class general {
	public static void main(String args[]) {

		double degreesX = 30;
	    double radiansX = Math.toRadians(degreesX);
	    
	    double degreesY = 30;
	    double radiansY = Math.toRadians(degreesY);

		
		System.out.print(((Math.sin(radiansX)+Math.cos(radiansY)/
				(Math.cos(radiansX) - Math.sin(radiansY))) * Math.tan(radiansY * radiansX)));
		
	}
}
