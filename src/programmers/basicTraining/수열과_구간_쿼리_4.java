package programmers.basicTraining;

public class 수열과_구간_쿼리_4 {
	
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < queries.length; i++) {
			
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			
			for(int j = s; j <= e; j++) {
				if(j%k==0) {
					arr[j] = arr[j] + 1;
					
				}
			}
			
		}
		
		answer = arr;
	}

}
