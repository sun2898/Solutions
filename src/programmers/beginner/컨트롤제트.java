package programmers.beginner;

import java.util.Arrays;

public class 컨트롤제트 {
	public static void main(String[] args) {
		
		String s = "-1 -2 -3 Z";
		int answer = 0;
		
		String[] result = s.split(" ");
		
		for(int i = 0; i < result.length; i++) {
			
			if (result[i].equals("Z")) {
				answer -= Integer.parseInt(result[i-1]);
			} else {
				answer += Integer.parseInt(result[i]);
			}
		}
		
		
		System.out.println(Arrays.toString(result));
		System.out.println(answer);
	}
}
