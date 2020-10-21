package erat;
import java.util.Scanner;

public class bricks {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the increment: ");
        int h = input.nextInt();
        
        System.out.print("Input the upper border: ");
        int a = input.nextInt();
        
        System.out.print("Input the bottom border: ");
        int b = input.nextInt();
        
        int x = 1;
        
        if ( x>2 ) {
        	for( int i = b; i <= a; ) {
        		System.out.print(i + " ");
        		i+=h;
        	}
        } else if ( x<=2 ) {
        	for( int i = b; i <= a; ) {
        		System.out.print(i + " ");
        		i+=h;
        	}
        }
        
        input.close();
	}
}
