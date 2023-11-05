package programmers.beginner;

public class 인덱스_바꾸기 {
	public static void main(String[] args) {
		
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		String answer = "";
				
		for(int i = 0; i < my_string.length(); i++) {
			if(i == num1) {
				answer += my_string.charAt(num2);
			} else if(i == num2) {
				answer += my_string.charAt(num1);
			} else {
				answer += my_string.charAt(i);				
			}
		}
		
		System.out.println(answer);
		
	}
}
