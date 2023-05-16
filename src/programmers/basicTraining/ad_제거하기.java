package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ad_제거하기 {

	public static void main(String[] args) {
		
		String[] strArr = {"and","notpad","abcad"};
		
		List<String> list = new ArrayList<>(Arrays.asList(strArr));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).contains("ad")) {
				list.remove(i);
				i--;
			}
		}
		
		String[] answer = list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(answer));
		
		
	}
}
