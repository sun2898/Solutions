package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 가장_큰_수_찾기 {
	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		int[] answer = new int[2];
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		answer[0] = Collections.max(list);
		answer[1] = list.indexOf(answer[0]);
		
		/* 다른사람의 풀이
		for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        */
		System.out.println(Arrays.toString(answer));
	}
}
