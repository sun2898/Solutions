package programmers.basicTraining;

public class 등차수열의_특정한_항만_더하기 {
	
	public static void main(String[] args) {
		int answer = 0;
		int a = 7;
		int d = 1;
		boolean[] included = {false, false, false, true, false, false, false};
		
		if(included[0]) {
			answer += a;
		}
		
		for(int i = 1; i < included.length; i++) {
			if(included[i]) {
				answer += a + d * i;				
			}
		}
		
		System.out.println(answer);
	}

}
