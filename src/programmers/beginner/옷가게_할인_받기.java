package programmers.beginner;

public class 옷가게_할인_받기 {

	public static void main(String[] args) {
		
		int price = 580000;
		int answer = 0;
		
		if(price >= 500000) {
			answer = (int)(price*0.8);
		} else if (price >= 300000) {
			answer = (int)(price*0.9);
		} else if (price >= 100000) {
			answer = (int)(price*0.95);
		} else {
            answer = price;
        }
		
		System.out.println(answer);
		
	}
}
