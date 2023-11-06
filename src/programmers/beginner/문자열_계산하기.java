package programmers.beginner;

public class 문자열_계산하기 {

	public static void main(String[] args) {
		String my_string = "2 + 3 + 6 - 3 + 1";
		int answer = 0;

		String[] arr = my_string.split(" ");

		answer = Integer.parseInt(arr[0]);
		
		for (int i = 1; i < arr.length-1; i+=2) {
			
			if (arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i+1]);
			} else {
				answer -= Integer.parseInt(arr[i+1]);
			}

		}
		System.out.println(answer);
	}

}
