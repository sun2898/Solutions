package programmers.beginner;

public class 외계행성의_나이 {

	public static void main(String[] args) {
		int age = 100;
		String answer = "";
		String strage = Integer.toString(age);
		char[] charage = strage.toCharArray();
		
		for(int i = 0; i < charage.length; i++) {
			charage[i] += 49;
			answer += charage[i];
		}
		
		System.out.println(answer);		
		
	}
}
