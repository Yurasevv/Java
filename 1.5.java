package erat;

public class general {
	public static void main(String args[]) {
		
		int HH = 0, MM = 0, SS = 0;
		
		double T = 360;
		
		while (T > 0) {
			SS++;
			if(SS == 60) {
				SS = 0;
				MM++;
				if(MM == 60) {
					MM = 0;
					HH++;
				}
			}
			T--;
		}

		//Цикл работает как часы:)
		
		System.out.println( HH +"H " + MM + "MM " + SS + "SS ");
	}
}

