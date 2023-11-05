package programmers.beginner;

import java.util.Arrays;

public class A로_B만들기 {

	public static void main(String[] args) {
		
		String before = "olleh";
		String after = "hello";
		int answer = 0;

		String[] str_before = before.split("");
		String[] str_after = after.split("");
		
		Arrays.sort(str_before);
		Arrays.sort(str_after);
		
		if(Arrays.equals(str_before, str_after)) {
			answer = 1;
		}
		
		System.out.println(Arrays.toString(str_before));
		System.out.println(Arrays.toString(str_after));
		System.out.println(Arrays.equals(str_before, str_after));
		System.out.println(answer);
	}
}
