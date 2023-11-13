package programmers.beginner;

import java.util.Arrays;

public class 안전지대 {
	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int answer = 0;
		int length = board[0].length;

		for (int i = 0; i < length; i++) {
			//1
			for (int j = 0; j < length - 1; j++) {
				//오른쪽
				if (board[i][j] == 1) {
					if (board[i][j + 1] != 1) {
						board[i][j + 1] = 2;
					}
				}
				// 아래
				if (board[j][i] == 1) {
					if (board[j + 1][i] != 1) {
						board[j + 1][i] = 2;
					}
				}
			}

			//2
			for (int j = 1; j < length; j++) {
				//왼쪽
				if (board[i][j] == 1) {
					if (board[i][j - 1] != 1) {
						board[i][j - 1] = 2;
					}
				}
				//위
				if (board[j][i] == 1) {
					if (board[j - 1][i] != 1) {
						board[j - 1][i] = 2;
					}
				}

			}
		}
		
		for(int i = 1; i < length; i++) {
			for(int j = 0; j < length -1; j++) {
				if(board[i][j] == 1) {
					if(board[i-1][j+1] != 1) {
						board[i-1][j+1] = 2;
					}
				}
				if(board[j][i] == 1) {
					if(board[j+1][i-1] != 1) {
						board[j+1][i-1] = 2;
					}
				}
			}
		}
		
		for(int i = 0; i < length-1; i++) {
			for(int j = 0; j < length-1; j++) {
				if(board[i][j] == 1 && board[i+1][j+1] != 1) {
					board[i+1][j+1] = 2;
				}
			}
		}
		
		for(int i = 1; i < length; i++) {
			for(int j = 1; j < length; j++) {
				if(board[i][j] == 1 && board[i-1][j-1] != 1) {
					board[i-1][j-1] = 2;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(board));

		for(int n = 0; n < length; n++) {
			for(int m = 0; m < length; m++) {
				if(board[n][m] == 0) {
					answer += 1;
				}
			}
		}
		
		System.out.println(answer);
	}
}
