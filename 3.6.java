package erat;

public class bricks {
	public static void main(String args[]) {
		
		String str = new String("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		
		StringBuilder answer = new StringBuilder();

		
		for (int i = 0; i < str.length();) {
	        char c = str.charAt(i);

	        answer.append(c + " ").append(Integer.toBinaryString(c)).append('\n');
	        
	        i+=2;
	    }
		
		System.out.print(answer.toString());
	}
}

//A B C D E F G
//H I J K L M N O P
//Q R S
//T U V
//W X Y and Z
//Now you know your ABC
//Next time won't you sing with me