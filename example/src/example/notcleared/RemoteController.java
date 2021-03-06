package example.notcleared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Question Name : 리모컨
 * Level : Gold 5
 * 
 * Question Contents : 수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 일부 숫자 버튼이 고장났다.
 * 리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다. 
 * 채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다.
 * 수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오. 
 * 수빈이가 지금 보고 있는 채널은 100번이다.
 * 
 * Input : 첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  
 * 둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. 
 * 고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.
 * 
 * Output : 첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.
 * 
 * @author kyoungtaekim
 *
 */


public class RemoteController {

	public static int currentChannel = 100;
	public static ArrayList<Integer> arrButtons = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// Input   
			String sChannel = br.readLine();
			int iWrongButton = Integer.parseInt(br.readLine());
			String sWrongButtons = br.readLine();
			//Init
			String[] buttons = sWrongButtons.split(" ");

			String text = " 어렵다 ";
			for(int i = 9 ; i >= 0 ; i--) {
				arrButtons.add(i);
			}
			
			for(int i = 0 ; i < buttons.length ; i++) 
				arrButtons.remove(Integer.parseInt(buttons[i]));
			
			System.out.println(getMoveCount(Integer.parseInt(sChannel), 100));
		}catch(IOException e) {
		}
		
	}

	public static int getMoveCount(int destination, int position) {
		if(destination == position)
			return 0;
		else if(destination > position) {
			int min = 500000;
			int A = 0;
			for(int v : arrButtons) {
				A = getMoveCount(destination, position + v);
				if(min > A)
					min = A;
			}
			return 1+A;
			
		}else {
			
		}
		
		return 1 + getMoveCount(destination, position);
	}
	
}
