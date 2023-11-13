package programmers.beginner;

public class 다항식_더하기 {
	public static void main(String[] args) {

		String polynomial = "x + 7 + 8";
		String answer = "";
		int a = 0;
		int b = 0;

		String[] arr = polynomial.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("+")) {
				if (arr[i].contains("x")) {
					if (arr[i].length() == 1) {
						a += 1;
					} else {
						a += Integer.parseInt(arr[i].replace("x", ""));
					}

				} else {
					b += Integer.parseInt(arr[i]);
				}
			}
		}
		
		if(a == 0) {
			answer = b+"";
		} else if (b == 0) {
			answer = a == 1 ? "x" : a + "x";
		} else {
			answer = a == 1 ? "x + " + b : a + "x + " + b;
		}

		System.out.println(answer);
	}
}
