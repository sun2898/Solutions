package programmers.beginner;

public class 중복된_문자_제거 {
	
	public static void main(String[] args) {
		
		String my_string = "We are the world";
		String[] my_arr = my_string.split("");
		String answer = "";
		
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_arr[i]) == my_string.lastIndexOf(my_arr[i])) {
				answer += my_arr[i];
			} else {
				if(my_string.indexOf(my_arr[i]) == i) {
					answer += my_arr[i];
				}
			}
		}
			
		System.out.println(answer);
	}
}
