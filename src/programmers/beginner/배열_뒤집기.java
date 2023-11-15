package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_뒤집기 {

	public static void main(String[] args) {
		
		int[] num_list = {1, 0, 1, 1, 1, 3, 5};
		
		List<Integer> list = new ArrayList<>(Arrays.stream(num_list).boxed().collect(Collectors.toList()));
		
		Collections.reverse(list);
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
}
