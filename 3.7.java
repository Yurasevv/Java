package erat;
import java.util.Scanner;

public class bricks {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input upper border:\n");
        int u = input.nextInt();
        
        System.out.print("Input bottom border:\n");
        int b = input.nextInt();
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = b; i < u; i++) {
        	for (int j = 2; j < i; j++) {
        		
        		if(i % j == 0) {
        			answer.append(j).append(" ");
        		}
        		
        	}
    		System.out.print("For " + i + ": " + answer.toString() + "\n");
    		answer.setLength(0);
        }
	}
}
