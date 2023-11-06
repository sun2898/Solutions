package programmers.beginner;

public class 이진수_더하기 {
	public static void main(String[] args) {
		
		String bin1 = "10";
		String bin2 = "11";
		String answer = "";
		
		int num = 0;
				
		num = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
		
		System.out.println(num);
		
		answer = Integer.toBinaryString(num);
		
		System.out.println(answer);
		
		
	}
}
