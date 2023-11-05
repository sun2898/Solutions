package programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class 약수_구하기 {
	public static void main(String[] args) {
		
		int n = 29;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				list.add(i);
			}
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
	}
}
