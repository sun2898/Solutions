package programmers.basicTraining;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] temp = arr.clone();
		
		int answer = 0;
		while(true) {
				
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= 50 && arr[i]%2==0) {
					arr[i] = arr[i]/2;
				} else if(arr[i] < 50 && arr[i]%2==1) {
					arr[i] = (arr[i]*2) + 1;
				} else {
					arr[i] = arr[i];
				}
			}
			
			
		}
			

	}
	}

