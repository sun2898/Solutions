package programmers.basicTraining;

public class 주사위게임2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 3;
		int answer = 0;
        
        if(a != b && b!=c && c!=a) {
            answer = a + b + c;
        } else if( (a==b && b!=c) || (a==c && b!=c) || (b==c && b!=a) ) {
            answer = (a + b + c) * ( (a*a)+(b*b)+(c*c) );
        } else if (a==b && b==c) {
            answer = (a + b + c) * ( (a*a)+(b*b)+(c*c) ) * ( (a*a*a)+(b*b*b)+(c*c*c) );
        }
        
        System.out.println(answer);
	}
}
