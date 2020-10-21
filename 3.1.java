package erat;
import java.util.Scanner;

public class bricks {
	public static void main(String args[]) {
		
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		
        int x = input.nextInt();
        
        for( int i = 1; i < x; i++) {
        	sum+=i;
        }
        
        input.close();
        
        System.out.print(sum);
	}
}
