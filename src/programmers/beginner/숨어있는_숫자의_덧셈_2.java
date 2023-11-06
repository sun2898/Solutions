package programmers.beginner;

public class 숨어있는_숫자의_덧셈_2 {
	
	public static void main(String[] args) {
		
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		
		String[] arr = my_string.split("[a-zA-Z]");
	
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				answer += Integer.valueOf(arr[i]);
			}
		}
		
		System.out.println(answer);
	}
}
