package programmers.beginner;

import java.util.Arrays;

public class 모스부호_1 {

	public static void main(String[] args) {
		
		String letter = ".... . .-.. .-.. ---";
		String answer = "";
		String[] letter2 = letter.split(" ");
		
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		for(int i = 0; i < letter2.length; i++) {
			for(int j = 0; j < morse.length; j++) {
				if(letter2[i].equals(morse[j])) {
					answer += Character.toString(j + 'a');
				}
			}
		}
		
		System.out.println(answer);
		
	}
}
