package programmers.beginner;

public class 구슬을_나누는_경우의_수 {

	public static void main(String[] args) {
		
		int balls = 5;
		int share = 3;
		long answer = 1;
		
		if (balls == share || share == 0)
            answer = 1;

        
        int a = (balls - share < share) ? balls - share : share;

        for (int i = 0; i < a; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        
        System.out.println(answer);
	}

}