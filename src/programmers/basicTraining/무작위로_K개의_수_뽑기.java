package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 무작위로_K개의_수_뽑기 {

	public static void main(String[] args) {
		
		int[] arr = {0};
		int k = 6;
		
		List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		
		list = list.stream().distinct().collect(Collectors.toList());
		
		int n = list.size();
		
		if(list.size() >= k) {
			list = list.subList(0, k);
		} else {
			for(int i = 0; i < k-n; i++) {
				list.add(-1);
			}
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
}

//List<Integer> list2 = IntStream.range(1, 10).boxed().toList(); //Arrays.stream(arr).boxed().toList();