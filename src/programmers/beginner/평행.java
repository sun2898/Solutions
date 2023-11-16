package programmers.beginner;

import java.util.Arrays;

public class 평행 {
	public static void main(String[] args) {
		int[][] dots = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 50, 100 } };
		int answer = 0;

		double[] line = new double[6];
		
		//1,2
		line[0] = (dots[0][1] - dots[1][1]) / (double) (dots[0][0] - dots[1][0]);
		
		//1,3
		line[1] = (dots[0][1] - dots[2][1]) / (double) (dots[0][0] - dots[2][0]);
		
		//1,4
		line[2] = (dots[0][1] - dots[3][1]) / (double) (dots[0][0] - dots[3][0]);
		
		//2,3
		line[3] = (dots[1][1] - dots[2][1]) / (double) (dots[1][0] - dots[2][0]);
		
		//2,4
		line[4] = (dots[1][1] - dots[3][1]) / (double) (dots[1][0] - dots[3][0]);
		
		//3,4
		line[5] = (dots[2][1] - dots[3][1]) / (double) (dots[2][0] - dots[3][0]);

		System.out.println(Arrays.toString(line));
		
		if(line[0] == line[5] || line[1] == line[4] || line[2] == line[3]) {
			answer = 1;
		}
		
		 System.out.println(answer);

	}
}
