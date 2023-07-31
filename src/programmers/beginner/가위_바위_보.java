package programmers.beginner;

public class 가위_바위_보 {

	public static void main(String[] args) {
		String rsp = "205"; //052
		String answer = "";
		
		for(int i = 0; i < rsp.length(); i++) {
			if(rsp.charAt(i)=='2') {
				answer += "0";
			} else if(rsp.charAt(i)=='0') {
				answer += "5";
			} else if(rsp.charAt(i)=='5') {
				answer += "2";
			}
		}
		
		System.out.println(answer);
	}
}
