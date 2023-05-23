package programmers.basicTraining;

public class 문자열이_몇_번_등장하는지_세기 {

	public static void main(String[] args) {
		
		String myString = "banana";
		String pat = "ana";
		int answer = 0;
		
		for(int i = 0; i < myString.length()-pat.length()+1; i++) {
			String str = myString.substring(i, pat.length()+i);
			
			if(str.equals(pat)) {
				answer += 1;
			}
			
		}
		
		System.out.println(answer);
	}
}
