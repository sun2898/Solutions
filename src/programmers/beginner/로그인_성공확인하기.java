package programmers.beginner;

public class 로그인_성공확인하기 {
	public static void main(String[] args) {

		String[] id_pw = { "programmer01", "15789" };
		String[][] db = { { "programmer02", "111111" }, { "programmer00", "134" }, { "programmer01", "1145" } };
		String answer = "";

		String id = id_pw[0];
		String pw = id_pw[1];

		for (int i = 0; i < db.length; i++) {
			if (!id.equals(db[i][0])) {
				answer = "fail";
			} else {
				if (pw.equals(db[i][1])) {
					answer = "login";
					break;
				} else {
					answer = "wrong pw";
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
