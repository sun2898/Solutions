package programmers.basicTraining;

public class 커피_심부름 {

	public static void main(String[] args) {
		
		String[] order = {"americanoice", "americano", "iceamericano"};
		int answer = 0;
		//아메 - 4500, 라떼 - 5000, 아무거나 = 아메 - 4500
		
		for(int i = 0; i < order.length; i++) {
			
			if(order[i].contains("latte")) {
				answer += 5000;
			} else {
				answer += 4500;
			}
		}
		
		System.out.println(answer);
		
		
	}
	
}
