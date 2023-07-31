package programmers.beginner;

public class 문자열_뒤집기 {
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		
		for(int i = my_string.length()-1; i >= 0; i--) {
			answer += my_string.charAt(i);
		}
		
		System.out.println(answer);
		
	}
}
