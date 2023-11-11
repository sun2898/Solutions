package baekjoon;

public class XYZ {
	public static void main(String[] args) {
		
		String str = "X";
		String newStr = "";
		int n = 3;
		
		
		for (int j = 0; j < n; j++) {
			
			int length = str.length();
			
			for (int i = 0; i < length; i++) {
				
				if (str.charAt(i) == 'X') {
				} else if (str.charAt(i) == 'Y') {
					newStr = str.replace("Y", "Z");
				} else if (str.charAt(i) == 'Z') {
					newStr = str.replace("Z", "X");
				}
				
				str = newStr;
			}
			System.out.println(str);
			
			
		}
		
		
	}
}
