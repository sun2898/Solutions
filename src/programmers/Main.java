package programmers;

public class Main {

	public static void main(String[] args) {

		String myString = "ABBAA"; 
		String pat = "AABB";
		int answer = 0;
		
		myString = myString.replace("A", "C");
		myString = myString.replace("B", "A");
		myString = myString.replace("C", "B");
		
		System.out.println(myString);
		
		if(myString.contains(pat)) {
			answer = 1;
		} else
			answer = 0;
		
		
	}
}

