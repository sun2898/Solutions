package programmers.basicTraining;

public class 간단한_논리_연산 {

	public static void main(String[] args) {
		boolean answer = true;
		boolean x1 = false; 
		boolean x2 = false;
		boolean x3 = true;
		boolean x4 = true;
		
		
		if( ((x1==false && x2==false) || (x3==false && x4==false)) ||
				(x1==false && x2==false && x3==false && x4==false)) {
			answer = false;
		}
		
		System.out.println(answer);
		
		
		
		
		
	}
}
