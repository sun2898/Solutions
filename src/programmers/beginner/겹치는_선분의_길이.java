package programmers.beginner;

import java.util.Arrays;

public class 겹치는_선분의_길이 {
	public static void main(String[] args) {

		int[][] lines = { { 0, 1 }, { 2, 5 }, { 3, 9 } };
		int answer = 0;

		if (lines[0][1] > lines[1][0]) {
			if (lines[0][1] >= lines[1][1]) {
				answer += lines[1][1] - lines[1][0];
			} else {
				answer += lines[0][1] - lines[1][0];
			}
		}
		
		
		System.out.println(Arrays.deepToString(lines));

	}
}
