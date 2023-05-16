package programmers.basicTraining;

import java.util.Arrays;

public class X사이의_개수 {

	public static void main(String[] args) {
		
		String myString = "oxooxoxxox";
		
		int count = 0;
		for(int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i)=='x') {
				count++;
			}
		}		
		
		String[] arr = myString.split("x", count+1);
		
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < answer.length; i++) {
			
			answer[i] = arr[i].length();
			
		}
		
		
		System.out.println(Arrays.toString(answer));
	}
}
