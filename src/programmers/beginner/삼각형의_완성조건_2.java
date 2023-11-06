package programmers.beginner;

public class 삼각형의_완성조건_2 {
	public static void main(String[] args) {
		
		int[] sides = {11, 7};
		
		int answer = sides[0] + sides[1] - Math.abs(sides[0]-sides[1]) -1;
		
		System.out.println(answer);
	}
}
