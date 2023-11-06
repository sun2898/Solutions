package programmers.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 한_번만_등정한_문자 {
	public static void main(String[] args) {
		String s = "hello";
		String answer = "";
		List<Character> list = new ArrayList<>();	
		
		for(int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				list.add(s.charAt(i));
			}
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		
		
		System.out.println(answer);
		
	}
}
