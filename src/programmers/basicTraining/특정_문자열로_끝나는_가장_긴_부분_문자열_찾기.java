package programmers.basicTraining;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
	
	public static void main(String[] args) {
		
		String answer = "";
		String myString = "AbCdEFG";
		String pat = "dE";
        
        int n = myString.lastIndexOf(pat);
        
       answer = myString.substring(0, n+pat.length());
       
       System.out.println(answer);
		
	}

}
