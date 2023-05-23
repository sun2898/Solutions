package programmers.basicTraining;

import java.util.Arrays;

public class 배열_만들기_3 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5}; 
		int[][] intervals = {{1, 3}, {0, 4}};
		
		int[] newArr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
		int[] newArr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
				
		int[] answer = new int[newArr1.length+newArr2.length];
		System.arraycopy(newArr1, 0, answer, 0, newArr1.length);
		System.arraycopy(newArr2, 0, answer, newArr1.length, newArr2.length);
		
		
		System.out.println(Arrays.toString(answer));
		
	}

}
