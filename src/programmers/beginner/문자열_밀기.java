package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열_밀기 {
	public static void main(String[] args) {

		String A = "apple";
		String B = "elppa";
		int answer = 0;
		List<String> list = Arrays.asList(A.split(""));

		// System.out.println(list.toString());
		for (int i = 0; i < A.length(); i++) {
			if (A.equals(B)) {
				answer = i;
				break;
			} else {
				Collections.rotate(list, 1);
				String AtoB = "";
				for (int j = 0; j < list.size(); j++) {
					AtoB += list.get(j);
				}
				
				A = AtoB;
				System.out.println(i + ": "+ AtoB);
			}
			
			if(i == A.length()-1 && !A.equals(B)) {
				answer = -1; 
			}
		}

		System.out.println(answer);

	}
}
