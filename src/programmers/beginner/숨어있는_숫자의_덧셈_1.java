package programmers.beginner;

public class 숨어있는_숫자의_덧셈_1 {
	public static void main(String[] args) {
		
		String my_string = "aAb1B2cC34oOp";
		char[] ch = my_string.toCharArray();
		int answer = 0;
		//'9'= 58
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] <= 58) {
				answer += Integer.parseInt(Character.toString(ch[i]));
			}
		}
		
		System.out.println(answer);
		
	}
}
