package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 문자열_정렬하기_1 {
	public static void main(String[] args) {
		
		String my_string = "hi12392";
		char[] my_char = my_string.toCharArray();		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < my_char.length; i++) {
			if(my_char[i] <= 57 ) {
				int a = Integer.parseInt(Character.toString(my_char[i]));
				list.add(a);
			}
		}

		list.sort(Comparator.naturalOrder());
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		System.out.println(Arrays.toString(answer));
	}
	
}
