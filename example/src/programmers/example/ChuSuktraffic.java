package programmers.example;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 추석 트래픽
 * 이번 추석에도 시스템 장애가 없는 명절을 보내고 싶은 어피치는 서버를 증설해야 할지 고민이다. 
 * 장애 대비용 서버 증설 여부를 결정하기 위해 작년 추석 기간인 9월 15일 로그 데이터를 분석한 후 초당 최대 처리량을 계산해보기로 했다. 
 * 초당 최대 처리량은 요청의 응답 완료 여부에 관계없이 임의 시간부터 1초(=1,000밀리초)간 처리하는 요청의 최대 개수를 의미한다.
 * 
 * @author kyoungtaekim
 *
 */


public class ChuSuktraffic {

	public static String[] INPUT = {
			"2016-09-15 20:59:57.421 0.351s",
			"2016-09-15 20:59:58.233 1.181s",
			"2016-09-15 20:59:58.299 0.8s",
			"2016-09-15 20:59:58.688 1.041s",
			"2016-09-15 20:59:59.591 1.412s",
			"2016-09-15 21:00:00.464 1.466s",
			"2016-09-15 21:00:00.741 1.581s",
			"2016-09-15 21:00:00.748 2.31s",
			"2016-09-15 21:00:00.966 0.381s",
			"2016-09-15 21:00:02.066 2.62s"};
	
	public static void main(String[] args) {
		System.out.println(solution(INPUT));
	}
	
	public static int solution(String[] lines) {
		int answer = 0 ; 
		
		for(int i = 0 ; i < lines.length ; i++) {
			String[] log = lines[i].split(" ");
			String[] ymd = log[0].split("-");
			String[] hdm = log[1].split(":");
			
//			Calendar c = Calendar.getInstance();
//			c.set(Calendar.YEAR, );
//			c.set(Calendar.MONTH, );
//			c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(ymd[2]));
//			c.set(Calendar.HOUR, Integer.parseInt(hdm[0]));
//			c.set(Calendar.MINUTE, Integer.parseInt(hdm[1]));
//			c.set(Calendar.SECOND, (int)(Double.parseDouble(hdm[2])*1000));
			
//			c.set(Integer.parseInt(ymd[0]), Integer.parseInt(ymd[1]), i, answer, i, i);
			
		}
		
		return answer;
	}

}
