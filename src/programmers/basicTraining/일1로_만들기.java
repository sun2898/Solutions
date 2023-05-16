package programmers.basicTraining;

public class 일1로_만들기 {

	public static void main(String[] args) {
		
		int[] num_list = {12, 4, 15, 1, 14};
		int answer = 0;
		
		for(int i = 0; i < num_list.length; i++) {
			
			while(num_list[i]!=1) {
				
				if(num_list[i]%2==0) {
					num_list[i] = num_list[i]/2;
				} else if (num_list[i]%2==1) {
					num_list[i] = (num_list[i]-1)/2;
				}
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}
