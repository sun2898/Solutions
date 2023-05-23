package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 문자열_묶기 {
	
	public static void main(String[] args) {
		int answer = 0;
		String[] strArr = {"a","bc","d","efg","hi", "dd"};
		
		int[] intArr = new int[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			intArr[i] = strArr[i].length();
		}
		
		System.out.println(Arrays.toString(intArr));
		
		List<Integer> list = new ArrayList<>();
		
		
		for(int i = 1; i <= 30 ; i++) {
			int count = 0;
			for(int j = 0; j < intArr.length; j++) {
				if(intArr[j]==i) {
					count += 1;
				}
			}
			list.add(count);
			list.sort(Comparator.reverseOrder());
		}
		
		System.out.println(list);
		
		answer = list.get(0);
		
		System.out.println(answer);
	}

}
