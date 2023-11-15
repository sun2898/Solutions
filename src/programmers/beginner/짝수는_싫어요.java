package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수는_싫어요 {

	public static void main(String[] args) {
		
		int n = 15;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			if(i%2==1) {
				list.add(i);
			}
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
	
	
}
