package programmers.beginner;

public class 삼육구게임 {
	public static void main(String[] args) {
		
		int answer = 0;
		int order = 29423;
		
		String str_order = Integer.toString(order);
		
		for(int i = 0; i < str_order.length(); i++) {
			if(str_order.charAt(i) == '3' || str_order.charAt(i) == '6' || str_order.charAt(i) == '9') {
				answer += 1;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
