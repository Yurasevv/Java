package erat;
import java.math.*;

public class bricks {
	public static void main(String args[]) {
		
		int counter = 1;
		BigInteger sum = BigInteger.valueOf(1);
		
		while(counter <= 200) {
			
			sum = sum.multiply(BigInteger.valueOf((long) counter * counter));
			counter++;
		}
		
		System.out.print(sum);
		
	}
}

//
