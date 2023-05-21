package programmers.basicTraining;


public class 날짜_비교하기 {

	public static void main(String[] args) {
		
		int answer = 0;
		int[] date1 = {1024, 12, 28};
		int[] date2 = {1024, 12, 29};
		
		if(date1[0]>date2[0]) {
			answer = 0;
		} else if(date1[0]<date2[0]){
			answer = 1;
		} else {
			if(date1[1]>date2[1]) {
				answer = 0;
			} else if (date1[1]<date2[1]) {
				answer = 1;
			} else {
				if(date1[2]>=date2[2]) {
					answer = 0;
				} else if(date1[2]<date2[2]) {
					answer = 1;
				}
			}
		}
		
		System.out.println(answer);		
	}
}
