package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_2 {
	
	public static void main(String[] args) {
		
		int l = 10; 
		int r = 20;
		
		List<Integer> list = new ArrayList<>(); 
		
		for(int i = l; i <= r; i++) {
			if(i%5==0) {				
				String number = Integer.toString(i);
				if(number.contains("1")||number.contains("2")||number.contains("3")
						||number.contains("4")||number.contains("6")||number.contains("7")
						||number.contains("8")||number.contains("9")) {

				} else {
					
					list.add(i);
				}
			}
		}
		if(list.size()==0) {
			list.add(-1);
		} 
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
			
		}
	}


