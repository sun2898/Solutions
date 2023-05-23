package programmers.basicTraining;

import java.math.BigInteger;

public class 두_수의_합 {

	public static void main(String[] args) {
		
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		// 0 - 48
		
		String answer = "";
		
		BigInteger ab = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		
		BigInteger sum = ab.add(bb);
		
		
		
		answer = sum.toString();
		
		System.out.println(answer);
		
	}
}
