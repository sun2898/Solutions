package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 정사각형으로_만들기 {

	public static void main(String[] args) {
		
		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		
		int n = arr.length;
		int m = arr[0].length;
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			List<Integer> s_list = new ArrayList<>();
			for(int j = 0; j < m; j++) {
				s_list.add(arr[i][j]);
			}
			list.add(s_list);
		}
		
		if(n > m) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n-m; j++) {
					list.get(i).add(0);									
				}
			}
		} else if (n < m) {
			for(int i = 0; i < m-n; i++) {
				list.add(new ArrayList<>());
				for(int j = 0; j < m; j++) {
					list.get(list.size()-1).add(0);					
				}
			}
		}
		
		
		int[][] answer = new int[Math.max(n,m)][];
		
		for(int i = 0; i < Math.max(n,m); i++) {
			answer[i] = new int[list.get(i).size()];
		}
		
		for (int i = 0; i < Math.max(n,m); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				answer[i][j] = list.get(i).get(j);
			}
		}
		
		System.out.println(Arrays.deepToString(answer));
	}
}
