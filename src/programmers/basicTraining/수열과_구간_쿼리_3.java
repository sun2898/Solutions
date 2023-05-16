package programmers.basicTraining;

public class 수열과_구간_쿼리_3 {
	
	public static void main(String[] args) {
		
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < queries.length; i++) {
			
				int n = queries[i][0];
				int m = queries[i][1];
				int temp = 0;
				
				temp = arr[n];
				arr[n] = arr[m];
				arr[m] = temp;
		}
		
		answer = arr;
	}

}
