package programmers.beginner;

import java.util.HashMap;
import java.util.Map;

public class 영어가_싫어요 {
	public static void main(String[] args) {
		
		String numbers = "onetwothreefourfivesixseveneightnineonethree";
		long answer = 0;
		
		String[] numberArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		Map<String, String> number = new HashMap<String, String>();
		
		for(int i = 0; i <= 9; i++) {
//			number.put(numberArray[i], Integer.toString(i));
			number.put(numberArray[i], String.valueOf(i));
		}
		
		
		for(int i = 0; i <= 9; i++) {
			//if(numbers.contains(numberArray[i])) {
				numbers = numbers.replace(numberArray[i], number.get(numberArray[i]));
			//}
		}
		
		answer = Long.parseLong(numbers);
		
		System.out.println(answer);
	}
}
