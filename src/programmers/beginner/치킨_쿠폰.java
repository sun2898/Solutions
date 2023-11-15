package programmers.beginner;

public class 치킨_쿠폰 {
	public static void main(String[] args) {
		int chicken = 1081;
		int mode = 0;
		int answer = 0;

		String strCh = Integer.toString(chicken);

		for (int i = 0; i < strCh.length(); i++) {
			if (chicken > 1) {
				mode += chicken % 10;
			} else {
				mode += chicken;
			}

			chicken = chicken / 10;
			answer += chicken;

			if (i == strCh.length() - 1 && mode >= 10) {
				mode = mode + (mode / 10);
			}
			
		}
		
		if(mode >= 10) {
			answer += (mode / 10);
		}
		
		System.out.println(answer);
	}
}
