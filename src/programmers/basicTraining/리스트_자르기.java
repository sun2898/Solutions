package programmers.basicTraining;

import java.util.Arrays;

public class 리스트_자르기 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int[] slicer = {1, 7, 3};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] answer = null;
		
		switch (n) {
		case 1:
			answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
			
			break;
		case 2:
			answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
			break;
		case 3:
			answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
			break;
		case 4:
			
			answer = new int[(slicer[1]-slicer[0]+slicer[2])/slicer[2]];
			for(int i = slicer[0], j=0; i <= slicer[1]; i+=slicer[2]) {
				answer[j] = num_list[i];
				j++;
			}
			break;
		}
		
		System.out.println(Arrays.toString(answer));
		
	
		
		
		
		
		
		
		
		
	}

}
