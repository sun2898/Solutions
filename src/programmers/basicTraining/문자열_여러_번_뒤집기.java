package programmers.basicTraining;

public class 문자열_여러_번_뒤집기 {

	public static void main(String[] args) {
		
		String answer = "";
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		
		char[] my_char = my_string.toCharArray();
		
		for(int i = 0; i < queries.length; i++) {
			int n = queries[i][0];
			int m = queries[i][1];
		
			for(int j = 0; j < n; j++) {
				answer += my_string.charAt(j);
			}
			
			
			for(int j = m; j >= n; j--) {
				answer += my_string.charAt(j);
			}
			
			for(int j = m+1; j < my_string.length(); j++) {
				answer += my_string.charAt(j);
			}
			
			my_string = answer;
			answer = "";
			System.out.println(my_string);
		}
		
		answer = my_string;
		
	}
}
