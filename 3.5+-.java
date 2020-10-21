package erat;

public class bricks {
	public static void main(String args[]) {
		
		double e = 0.1;
		
		double sum = 0;
		
		for( int i = 0; i < 100; i++) {
			
			if(1/Math.pow(2, i) + 1/Math.pow(3, i) >= e) {
				sum+= 1/Math.pow(2, i) + 1/Math.pow(3, i);
			}
		}
		System.out.print(sum);
	}
}

//
