package programmers.basicTraining;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_4 {
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 2, 5, 3};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(list.size()==0) {
				list.add(arr[i]);
			} else {
				if(list.get(list.size()-1) < arr[i]) {
					list.add(arr[i]);
				}
				else {
					list.remove(list.get(list.size()-1));
					i--;
				}
			}
			
		}
		
		int[] stk = list.stream().mapToInt(a -> a).toArray();
		
		
		
		
	}
}
