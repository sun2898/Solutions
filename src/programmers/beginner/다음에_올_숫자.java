package programmers.beginner;

public class 다음에_올_숫자 {
	public static void main(String[] args) {
		int common[] = {2, 0, -2, -4, -6};
		int answer = 0;
		
        int check = 0;
		
		for(int i = 0; i < common.length; i++) {
			if(common[i] == 0) {
				check = 1;
				break;
			} 
		}
		
		if(check == 0 && (common[1] / common[2]) == (common[0] / common[1])) {
			answer = common[common.length-1] * (common[1] / common[0]);
		} 
		
		if((common[2] - common[1]) == (common[1] - common[0])) {
			answer = common[common.length-1] + (common[1] - common[0]);
		}
				
		System.out.println(answer);
	}
}
