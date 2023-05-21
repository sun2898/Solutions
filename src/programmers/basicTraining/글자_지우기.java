package programmers.basicTraining;

import java.util.Arrays;

public class 글자_지우기 {

	public static void main(String[] args) {

		String answer = "";
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		//  {0, 1, 3, 6, 10, 11, 15, 16}
		Arrays.sort(indices);

		for(int i = 0, j = 0; i < indices.length; i++) {
			if(indices[i]==j) {
				j++;
				continue;
			} else {
				answer += my_string.charAt(j);
				i--;
				j++;
				System.out.println(answer);
			}
		}
		
		if(indices[indices.length-1] < my_string.length()) {
			answer += my_string.substring(indices[indices.length-1]+1, my_string.length());
		}

		System.out.println(answer);

	}

}
