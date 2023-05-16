package programmers.basicTraining;

import java.util.Arrays;

public class 특별한_2차원_배열1 {
	
	public static void main(String[] args) {
		
		int n =  3;
		int[][] answer = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==j) {
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
				}
			}
		}
		
		
	}

}
