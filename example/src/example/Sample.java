package example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Sample {

	public Sample() {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss.SSS"); //SSS가 밀리세컨드 표시
		Calendar calendar = Calendar.getInstance();
		System.out.println(dateFormat.format(calendar.getTime()));
		String answer = solution(participant, completion);
		
		System.out.println("answer : " + answer);
		calendar = Calendar.getInstance();
		System.out.println(dateFormat.format(calendar.getTime()));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < completion.length; i++) {
			list.add(completion[i]);
		}
		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (participant[i].equals(list.get(j))) {
					list.remove(i);
					break;
				}
				if (j == list.size() - 1) {
					return participant[i];
				}
			}

		}

		return answer;
	}

}
