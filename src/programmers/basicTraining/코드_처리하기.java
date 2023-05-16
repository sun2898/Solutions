package programmers.basicTraining;

public class 코드_처리하기 {
	
	public static void main(String[] args) {
		
		int mode = 0;
		String code = "1aasd1fsd1as1a1fd1";
		String answer = "";
		
		for(int i = 0; i < code.length(); i++) {
			if(mode==0) {
				if((code.charAt(i)!='1') && (i%2 == 0)) {
					answer += code.charAt(i);
				} else if(code.charAt(i)=='1') {
					mode = 1;
				}
			} else {
				if((code.charAt(i)!='1') && (i%2 == 1)) {
					answer += code.charAt(i);
				} else if(code.charAt(i)=='1') {
					mode = 0;
				}
			}			
		}
		
		if (answer.length()==0) {
			answer = "EMPTY";
		}
		
	}

}
