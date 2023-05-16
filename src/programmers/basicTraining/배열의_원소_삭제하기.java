package programmers.basicTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열의_원소_삭제하기 {

	public static void main(String[] args) {
		
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {777, 104, 1000, 1, 12};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> delete = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
		
		
		for(int i = 0; i < delete_list.length; i++) {
			if(list.contains(delete.get(i))) {
				list.remove(delete.get(i));
			}	
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();		
		
		System.out.println(Arrays.toString(answer));
		
        
    }
}






