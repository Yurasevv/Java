package erat;

public class bricks {
	public static void main(String args[]) {
		
		int x = 4;
		
		double foo1 = Math.pow(x, 2) - 3*x + 9;
		double foo2 = 1/ ( Math.pow(x, 3) + 6 ) ;
		
		double result = 0;
		
		if ( x <= 3) {
			System.out.print( foo1 );
		} else if ( x>3 ) {
			System.out.print( foo2 );
		}
	}
}
