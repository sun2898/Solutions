package programmers.beginner;

public class 암호_해독 {
	
	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk"; 
		int code = 4;
		String answer = "";
		
		for(int i = code-1; i < cipher.length(); i+=code) {
			answer += cipher.charAt(i);
		}
		
		System.out.println(answer);
	}
}
