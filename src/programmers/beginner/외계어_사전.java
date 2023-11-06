package programmers.beginner;

public class 외계어_사전 {
	public static void main(String[] args) {

		String[] spell = { "s", "o", "m", "d" };
		String[] dic = { "moos", "dzx", "smm", "sunmmo", "som" };
		int answer = 2;

		for (int d = 0; d < dic.length; d++) {
			for (int s = 0, check = 0; s < spell.length; s++) {
				if (dic[d].contains(spell[s])) {
					check++;
				}
				if (check == spell.length) {
					answer = 1;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
}
