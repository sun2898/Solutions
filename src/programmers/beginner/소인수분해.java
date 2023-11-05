package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소인수분해 {
	public static void main(String[] args) {
		
		int n = 420;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 2; i <= n; i++) {
			if(n%i==0) {
				n = n/i;
				list.add(i);
				i = 1;
			}
		}
		
		list.stream().distinct().mapToInt(a -> a).toArray();
		
		int[] answer = list.stream().distinct().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
}
