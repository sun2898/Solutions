package programmers.beginner;

import java.util.Arrays;

public class OX_QUIZ {
	
	public static void main(String[] args) {
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			String[] cal = quiz[i].split(" ");
			
			int a = Integer.parseInt(cal[0]);
			//String str = cal[1];
			int b = Integer.parseInt(cal[2]);
			int result = Integer.parseInt(cal[4]);
			
			if(cal[1].equals("+")) {
				answer[i] = a + b == result ? "O" : "X";
			} else {
				answer[i] = a - b == result ? "O" : "X";
			}
			
		}
			System.out.println(Arrays.toString(answer));
		
		
		//String[] answer = {};
	}
}
