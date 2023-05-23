package programmers.basicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 왼쪽_오른쪽 {

	public static void main(String[] args) {

		String[] str_list = {"d", "d", "l", "d", "u"};

		List<String> list = new ArrayList<>(Arrays.asList(str_list));
		List<String> list2 = new ArrayList<>();

		if(list.indexOf("l")<list.indexOf("r")) {
			if(list.indexOf("l")==-1) {
				for(int i = list.indexOf("r")+1; i < list.size(); i++) {
					list2.add(list.get(i));
				}
			} else {
				for(int i = 0; i<list.indexOf("l"); i++) {
					list2.add(list.get(i));
				}
			}
		} else {
			if(list.indexOf("r")==-1) {
				for(int i = 0; i<list.indexOf("l"); i++) {
					list2.add(list.get(i));
				}
			} else {
				for(int i = list.indexOf("r")+1; i < list.size(); i++) {
					list2.add(list.get(i));
				}
			}
		}

		if(!list.contains("l") && !list.contains("r")) {
			list2.clear();
		}

		if(list2.size()==1 && (list2.contains("l") || list2.contains("r"))) {
			list2.remove(list2.get(0));
		}

		String[] answer = list2.toArray(new String[list2.size()]);

		System.out.println(Arrays.toString(answer));
	}
}
