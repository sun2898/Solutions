package programmers;

import java.util.Scanner;

public class ArrayCheck {
	public static void main(String[] args) {
		int[] st = new int[10];
		int[] hw = new int[8];
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 8; i++) {
			hw[i] = scan.nextInt();
			st[hw[i]-1] = hw[i];
		}
		
		for(int i = 0; i <10; i++) {
			if(st[i]==0) {
				System.out.println(i+1);
			}
		}
		
		scan.close();
	}

}
