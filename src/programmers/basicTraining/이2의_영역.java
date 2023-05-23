package programmers.basicTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 이2의_영역 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 1, 4, 5, 2};
		int[] answer = null;
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		if(list.contains(2)) {
		
		answer = list.subList(list.indexOf(2), list.lastIndexOf(2)+1).stream().mapToInt(a -> a).toArray();
		
		} else {
			list.removeAll(list);
			list.add(-1);
			answer = list.stream().mapToInt(a -> a).toArray();
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
