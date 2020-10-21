package erat;

public class bricks {
	public static void main(String args[]) {
		
		int sum = 0;
		
		int counter = 0;
		
		while(counter <= 100) {
			sum+= Math.pow(counter, 2);
			counter++;
		}
		
		System.out.print(sum);
	}
}
