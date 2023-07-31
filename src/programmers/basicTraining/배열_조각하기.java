package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_조각하기 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		for(int i = 0; i < query.length; i++) {
			if(i%2==0) {
				for(int j = query[i]+1; j < list.size(); j++) {
					list.remove(j);
					j--;
					
				}
			} else {
				for(int j = 0; j < query[i]; j++) {
					list.remove(0);
				}
			}
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();		
		
	}
}
