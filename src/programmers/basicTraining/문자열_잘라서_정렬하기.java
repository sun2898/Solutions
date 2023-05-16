package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_잘라서_정렬하기 {
	
	public static void main(String[] args) {
		
		String myString = "dxccxbbbxxaxxxaxa";
		String[] arr = myString.split("x");
		
		System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<>(Arrays.asList(arr));		
		
		for(int i = 0; i < list.size(); i++) {
			list.remove("");			
		}
		
		
		System.out.println(list.toString());
		
		String[] answer = list.toArray(new String[list.size()]);
		
		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
		
		
	}

}
