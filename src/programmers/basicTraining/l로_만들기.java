package programmers.basicTraining;

public class l로_만들기 {
	
	public static void main(String[] args) {
		
		String myString = "abcdevwxyz"; //"lllllvwxyz"
		
		for(int i = 0; i < myString.length(); i++) {
		if(myString.charAt(i)<='l') {
			myString = myString.replace(myString.charAt(i), 'l');
		}
		}
		
		System.out.println(myString);
		
	}

}
