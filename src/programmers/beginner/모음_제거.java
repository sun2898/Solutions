package programmers.beginner;

public class 모음_제거 {
	public static void main(String[] args) {
		String my_string = "nice to meet you";
		String answer = "";
		
		answer = my_string.replace("a", "").replace("e", "")
				.replace("i", "").replace("o", "").replace("u", "");
		
		System.out.println(answer);
		
	}
}
