package programmers.basicTraining;

public class 수_조작하기_2 {

	public static void main(String[] args) {
		
		
		String answer = "";
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		//w1, s-1, d+10, a-10
		
		
		for(int i = 1; i < numLog.length; i++) {
			
			switch (numLog[i]-numLog[i-1]) {
			case 1 :
				answer += 'w';
				break;
			case -1 :
				answer += 's';
				break;
			case 10 :
				answer += 'd';
				break;
			case -10 :
				answer += 'a';
				break;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
