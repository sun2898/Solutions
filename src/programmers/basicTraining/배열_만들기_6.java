package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_6 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 1, 0};
		
		List<Integer> list = new ArrayList<>(); 
		
		for(int i = 0; i < arr.length; i++) {
			if(list.size()==0) {
				list.add(arr[i]);
			} else {
				if(list.get(list.size()-1)==arr[i]) {
					list.remove(list.size()-1);
				} else {
					list.add(arr[i]);
				}
			}
		}
		
		if(list.size()==0) {
			list.add(-1);
		}		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
		
	}
}
