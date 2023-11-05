package programmers.beginner;

public class K의_개수 {
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 13;
		int k = 1;
		int answer = 0;
		String aaa = "";
		
		for(int a = i; a <= j; a++) {
			aaa += a;			
		}
		
		for(int a = 0; a < aaa.length(); a++) {
			if(aaa.charAt(a)==(char)(k+'0')) {
				answer += 1;
			}
		}
		
		System.out.println(answer);
	}
}
