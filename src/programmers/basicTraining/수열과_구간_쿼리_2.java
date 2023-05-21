package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수열과_구간_쿼리_2 {
	
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {3, 4, -1}};
		List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            List<Integer> list = new ArrayList<>();
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    list.add(arr[i]);
                }
            }

            if (!list.isEmpty()) {
                Collections.sort(list);
                answer.add(list.get(0));
            } else {
                answer.add(-1);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }	
		
		
		
	}

}
