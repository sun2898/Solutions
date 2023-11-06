package programmers.beginner;

import java.util.Arrays;

public class 잘라서_배열로_저장하기 {

	public static void main(String[] args) {
		
		String my_str = "abc1Addfggg4556b";
		int n = 1;
		int cut = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
		String[] answer = new String[cut];
		
		for(int i = 0; i < answer.length; i++) {
			if(i < answer.length-1) {
				answer[i] = my_str.substring(i*n, (i+1)*n);
			} else {
				answer[i] = my_str.substring(i*n, my_str.length());
			}
		}
		
		System.out.println(cut);
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
	}
}
