package erat;

public class general {
	public static void main(String args[]) {

		double number = 123.456;	
		
		double result = 0;
		
		result = (number * 1000) % 1000 + (int)number / 1000.0;
		
		// Пользуясь тем, что при переводе в int число не округляется,
		// я всегда буду получать правильную целую часть
		
		System.out.print(result);
	}
}
