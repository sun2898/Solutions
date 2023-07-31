package programmers.beginner;

public class 자릿수_더하기 {
	public static void main(String[] args) {
		int n = 938271;
		int answer = 0;
		char[] ch = Integer.toString(n).toCharArray();
		//'1' = 49
		for(int i = 0; i < ch.length; i++) {
			ch[i] -= 48;
			answer += ch[i];
		}
		
		System.out.println(answer);
	}
}
