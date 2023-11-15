package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 최빈값_구하기 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 3, 3, 4, 4, 4, 5, 5};
		Arrays.sort(array);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0, n = 0; i < array.length-1; i++) {
			if(array[i]==array[i+1]) {
				n++;
				list.add(n+1);
				
			} else {
				n = 0;
				list.add(n+1);
			}
		}
		
		System.out.println(list.toString());
		
		
		if(list.get(list.size()-1)==list.get(list.size()-2)) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
		
		
		
		
	}

}
