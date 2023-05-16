package programmers.basicTraining;

public class 문자열_뒤집기 {
	
	public static void main(String[] args) {
		
		String answer = "";
		String my_string =  "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		answer += my_string.substring(0, s);
		
		for(int i = e; i >= s; i--) {
			answer += my_string.charAt(i);
		}
		
		answer += my_string.substring(e+1, my_string.length());
		
		System.out.println(answer);
		
	}

}
