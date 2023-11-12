package programmers.beginner;

import java.util.Arrays;
import java.util.HashMap;

public class 등수_매기기 {
	public static void main(String[] args) {
		
//		int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		int[][] score = {{2,4}, {4,2}};
		int length = score.length;
		int[] answer = new int[length];
		double[] average = new double[length];
		double[] avg = new double[length];
		
		for(int i = 0; i < length; i++) {
			average[i] = (score[i][0] + score[i][1]) / 2.0;
			avg[i] = (score[i][0] + score[i][1]) / 2.0;
		}
		
		Arrays.sort(average);
		
		System.out.println(Arrays.toString(avg));
		System.out.println(Arrays.toString(average));
		
		int[] rank = new int[length];
		
		for(int i = 1; i < length; i++) {
			if(average[length-i] == average[length-i-1]) {
				rank[length-i-1] = i;
			} else {
				rank[length-i-1] = i+1;
			}
		}
		
		if(length != 1) {
			if(rank[length-2] != 1) {
				rank[length-1] = rank[length-2]-1;
			} else {
				rank[length-1] = 1;
			}
		} else {
			rank[0] = 1;
		}
		
		System.out.println(Arrays.toString(rank));
		
		HashMap<Double, Integer> map = new HashMap<>();
		
		for(int i = 0; i < length; i++) {
			map.put(average[i], rank[i]);
		}
		
		System.out.println(map.toString());
		
		for(int i = 0; i < length; i++) {
			answer[i] = map.get(avg[i]);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
