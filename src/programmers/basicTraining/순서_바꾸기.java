package programmers.basicTraining;

import java.util.Arrays;

public class 순서_바꾸기 {
	
	public static void main(String[] args) {
		
		int[] num_list = {5, 2, 1, 7, 5};		
		int[] answer = new int[num_list.length];
		int n = 3;
		
		System.arraycopy(num_list, n, answer, 0, num_list.length-n);
		System.arraycopy(num_list, 0, answer, num_list.length-n, n);
		
		System.out.println(Arrays.toString(answer));
		
	}

}
