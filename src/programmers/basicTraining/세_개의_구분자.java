package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 세_개의_구분자 {
	
	public static void main(String[] args) {
		
		String myStr = "cabab";
		String[] myArr = myStr.split("[a-c]");
		System.out.println(Arrays.toString(myArr));
		
		List<String> list = new ArrayList<>(Arrays.asList(myArr));
		
		list.removeIf(String::isEmpty);
		
		System.out.println(list.toString());
		
		if(list.size()==0) {
			list.add("EMPTY");
		}
		
		String[] answer = list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(answer));
		
		
		
		
	}

}
