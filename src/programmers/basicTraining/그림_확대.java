package programmers.basicTraining;

import java.util.Arrays;

public class 그림_확대 {

	public static void main(String[] args) {
		
		String[] picture = {"x.x", ".x.", "x.x"}; 
		int k = 3;
		String[] answer = new String[picture.length * k];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = "";
		}		

		for(int i = 0, n = 0; i < picture.length; i++) {		
			for(int j = 0; j < k; j++) {	
				for(int m = 0; m < picture[i].length(); m++) {	
					for(int a = 0; a < k; a++) {
						answer[n] += picture[i].charAt(m);
					}
				}
				n++;
			}
		}	
		
		System.out.println(Arrays.toString(answer));
		
	}
}
