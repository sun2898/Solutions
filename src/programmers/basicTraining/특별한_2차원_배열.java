package programmers.basicTraining;

public class 특별한_2차원_배열 {
	
	public static void main(String[] args) {
		
		int answer = 0;
		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};		
		
		x: for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[i][j]==arr[j][i]) {
					 answer = 1;
				 } else {
					 answer = 0;
					 break x;
				 } 
			 }
		}
		
		 System.out.println(answer);
		 
 	}

}
