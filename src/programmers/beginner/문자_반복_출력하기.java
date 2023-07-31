package programmers.beginner;

public class 문자_반복_출력하기 {
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer = "";
		
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < n; j++) {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
	}
}
