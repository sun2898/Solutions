package programmers;

public class Solution {

	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0,0};

		for(int i = 0; i < keyinput.length; i++) {
			switch(keyinput[i]) {
			case "left":
				if(Math.abs(answer[0]) >= (board[0]-1)/2) {
					answer[0] -= 1;   
				}
				break;
			case "right":
				if(Math.abs(answer[0]) >= (board[0]-1)/2) {
					answer[0] += 1;
				}
				break;
			case "up":
				if(Math.abs(answer[0]) >= (board[1]-1)/2) {
					answer[1] += 1;
				}
				break;
			case "down":
				if(Math.abs(answer[0]) >= (board[0]-1)/2) {
					answer[1] -= 1;
				}
				break; 
			}
		}

		return answer;
	}
}
