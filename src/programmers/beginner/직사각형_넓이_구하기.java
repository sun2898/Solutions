package programmers.beginner;

public class 직사각형_넓이_구하기 {
	public static void main(String[] args) {

		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
		int answer = 0;

		int width = 0;
		int height = 0;

		if (dots[0][0] == dots[1][0]) {
			width = Math.abs(dots[0][1] - dots[1][1]);
			height = Math.abs(dots[1][0] - dots[2][0]);
		} else if(dots[0][1] == dots[1][1]) {
			width = Math.abs(dots[0][0] - dots[1][0]);
			height = Math.abs(dots[1][1] - dots[2][1]);
		} else {
			width = Math.abs(dots[0][0]-dots[1][0]);
			height = Math.abs(dots[0][1]-dots[1][1]);
		}
		
		answer = width * height;
		
		System.out.println(answer);
	}
}
