package programmers.basicTraining;

public class 주사위게임3 {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 1;
		int c = 4;
		int d = 4;
		int answer = 0;
		
		if(a == b && b == c && c == d) {
			answer = 1111 * a;
		} 
		
		else if(a == b && b == c && c != d) {
			answer = (10 * a + d) * (10 * a + d);
		} else if(a == c && c == d && c != b) {
			answer = (10 * a + b) * (10 * a + b);
		} else if(a == b && b == d && d != c) {
			answer = (10 * a + c) * (10 * a + c);
		} else if(b == c && c == d && d != a) {
			answer = (10 * b + a) * (10 * b + a);
		} else if(a == b && c == d && b != c) {
			answer = (a + c) * Math.abs(a - c);
		} else if(a == c && b == d && b != c) {
			answer = (a + b) * Math.abs(a - b);
		} else if(a == d && b == c && b != d) {
			answer = (a + b) * Math.abs(a - b);
		} 
		
		
		else if(a == b && a != c && a != d && c != d) {
			answer = c * d;
		} else if(a == c && a != b && a != d && b != d) {
			answer = b * d;
		} else if(b == c && a != b && a != d && b != d) {
			answer = a * d;
		} else if(a == d && a != b && a != c && b != c) {
			answer = b * c;
		} else if(b == d && a != b && a != c && b != c) {
			answer = a * c;
		} else if(c == d && a != b && a != c && b != d) {
			answer = a * b;
		} else {
			int min = Math.min(a, b);
			int min2 = Math.min(c, d);
			answer = Math.min(min, min2);
		}
		
		System.out.println(answer);
	}
}
