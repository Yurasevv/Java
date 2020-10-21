package erat;

public class general {
	public static void main(String args[]) {
		
		int x = 60, y = 30;
		
		if( x>0 && y>0 && x + y < 180) {
			System.out.println("Существует");
			
			if( x+y == 90) {
				System.out.print("Прямоугольный");
			}
		}
	}
}
