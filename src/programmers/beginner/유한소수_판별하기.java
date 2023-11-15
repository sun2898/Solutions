package programmers.beginner;

public class 유한소수_판별하기 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int answer = 0;
		int maxNum = 1;
			
		//최대공약수 구하기
		for(int i = 2; i <= Math.min(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				maxNum = i;
			}
		}
		
		//기약분수 만들기
		if(maxNum != 1) {
			a /= maxNum;
			b /= maxNum;
		}
		
		System.out.println("a: " + a + " b: " + b);
		
		if(b == 1 || b == 2 || b == 4 || b == 5) {
			answer = 1;
		} else if(b == 3){
			answer = 2;
		} else {
			while(b > 5) {
				if(b % 5 == 0) {
					b /= 5;
					answer = 1;
					continue;
				} else if (b % 2 == 0) {
					b /= 2;
					answer = 1;
					continue;
				} else {
					answer = 2;
					break;
				}
			}
			
			if(b == 3) {
				answer = 2;
			}

		}
		
		System.out.println(answer);
		
		
	}
}
