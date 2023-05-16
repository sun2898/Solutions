package programmers.basicTraining;

public class 세로_읽기 {
	
	public static void main(String[] args) {
		
		String answer = "";
		String my_string = "ihrhbakrfpndopljhygc";		
		
		int m = 4; 
		int c = 2;
		
		for(int i = c-1; i < my_string.length(); i+=m) {
			
			answer += my_string.charAt(i);
			
		}
		
		System.out.println(answer);
		
		
		
		
		
		
	}

}
