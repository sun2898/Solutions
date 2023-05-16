package programmers.basicTraining;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_5 {

	public static void main(String[] args) {
		
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		int k = 50000;
		int s = 5; 
		int l = 5;
		int n = 0;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < intStrs.length; i++) {
			int num = Integer.parseInt(intStrs[i].substring(s, s + l));
			
			if(num > k) {
				list.add(n, num);
				n++;
			}
		}
		
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		
		
		
		
	}
	
}
