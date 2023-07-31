package programmers.beginner;

public class 문자열안에_문자열 {
	public static void main(String[] args) {
		
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CDa";
		
		int answer = str1.contains(str2) ? 1 : 2;
			
		System.out.println(answer);
	}
}
