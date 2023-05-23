package programmers.basicTraining;

import java.util.Arrays;

public class 문자_개수_세기 {
	
	public static void main(String[] args) {
		
		String my_string = "Programmers";
		int[] answer = new int[52];
		//A-Z(65-90),a-z(97,122)
		for(int i = 0; i < my_string.length(); i++) {
			
			for(int j = 65; j <= 90; j++) {
				if(my_string.charAt(i)==j) {
					answer[j-65] += 1;
				}
			}
			
			for(int j = 97; j <= 122; j++) {
				if(my_string.charAt(i)==j) {
					answer[j-71] += 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
