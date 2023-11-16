package programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 특이한_정렬 {
	public static void main(String[] args) {
		int[] numlist = {4, 5, 3, 6, 2, 1}; 
		int n = 4;
		int[] answer = new int[numlist.length];
		int[] answer2 = new int[numlist.length];
		
		Arrays.sort(numlist);
		
		List<Integer> sortList = new ArrayList<>();
		
		for(int i = 0; i < numlist.length; i++) {
			sortList.add(i, Math.abs(n-numlist[i]));
		}
		
		System.out.println("sortList: " + sortList.toString());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < numlist.length; i++) {
			map.put(numlist[i], sortList.get(i));
		}
		//System.out.println(map);
		
		List<Map.Entry<Integer, Integer>> entries = 
				map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());

		System.out.println(entries.toString());
		
		
		for(int i = 1; i < numlist.length; i++) {
			if(entries.get(i-1).getValue().equals(entries.get(i).getValue())
					&& entries.get(i).getKey() > entries.get(i-1).getKey()) {
				answer[i-1] = entries.get(i).getKey();
				answer[i] = entries.get(i-1).getKey();
				i++;
			} else {
				answer[i] = entries.get(i).getKey();				
				answer[i-1] = entries.get(i-1).getKey();
			}
		}
		
		if(answer[numlist.length-1] == 0) {
			answer[numlist.length-1] = entries.get(numlist.length-1).getKey();
		}
		
		System.out.println(Arrays.toString(answer));
//		keySet.sort((o1, o2) -> map.get(o1).compareTo(map.get(o2)));
		
		//2 고수의 풀이
		answer2 = Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
		
		System.out.println(Arrays.toString(answer2));
	}
}
