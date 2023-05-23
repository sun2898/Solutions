package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 빈_배열에_추가_삭제하기 {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(flag[i]==true) {
				for(int n = 1; n <= arr[i]*2; n++) {
					list.add(arr[i]);
					
				}
			} else {
				for(int n = 1; n <= arr[i]; n++) {
					list.remove(list.size()-1);
				}
			}
			System.out.println(list.toString());
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
}
