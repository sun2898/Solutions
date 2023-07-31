package programmers.basicTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 전국_대회_선발_고사 {

	public static void main(String[] args) {
		
		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
		int answer = 0;
		List<Integer> list = Arrays.stream(rank).boxed().collect(Collectors.toList());
		
		int[] result = new int[3];
		
		for(int i = 0, n = 1; i < result.length; i++) {
			if(attendance[list.indexOf(n)]==true) {
				result[i] = list.indexOf(n);
				n++;
			} else {
				n++;
				i--;
			}
		}
		
		answer = (10000 * result[0]) + (100 * result[1]) + result[2];
		
		System.out.println(answer);
		
	}
}
