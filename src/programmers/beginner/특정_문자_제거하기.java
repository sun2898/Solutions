package programmers.beginner;

public class 특정_문자_제거하기 {
	public static void main(String[] args) {
		String my_string = "abcfdef";
		String letter = "f";
		
		String answer = "";
		
		answer = my_string.replace(letter, "");
		
		System.out.println(answer);
		
		
		
	}
}
