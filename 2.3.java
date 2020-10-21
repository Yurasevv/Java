package erat;

public class bricks {
	public static void main(String args[]) {
		
		int A[] = new int[] { 1, 1 };
		int B[] = new int[] { 1, 1 };
		int C[] = new int[] { 4, 4 };
		
		
		if( (B[0] - A[0]) * C[0] == (B[1] - A[1]) * C[1] ){
			System.out.print("on one straight line");
		} else {
			System.out.print("not on one straight line");
		}
	}
}

//Math.