package programmers.beginner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열_정렬하기_2 {
	public static void main(String[] args) {
		
		String my_string = "heLLo";
		String answer = "";
		
		answer = Stream.of(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
		System.out.println(answer);
		
		
	}
}
