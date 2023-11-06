package programmers.beginner;

public class 칠7의_개수 {
	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		int answer = 0;
		String str = "";		
		
		for(int i = 0; i < array.length; i++) {
			str += array[i];
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '7') {
				answer += 1;
			}
		}
		
		System.out.println(answer);
	}
}
