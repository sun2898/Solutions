package programmers.basicTraining;

public class 배열_비교하기 {

	public static void main(String[] args) {
		int answer = 0;
		int[] arr1 = {100, 17, 84, 1};
		int[] arr2 = {55, 12, 65, 36};
		
		int sum1 = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		
		if(arr1.length != arr2.length) {
			if(arr2.length > arr1.length) {
				answer = -1;
			} else {
				answer = 1;
			}
		}
		else {
			if(sum2 > sum1) {
				answer = -1;
			} else if(sum1 > sum2) {
				answer = 1;
			} else if(sum1 == sum2) {
				answer = 0;
			}
		}
		
		System.out.println(answer);


	}
}
