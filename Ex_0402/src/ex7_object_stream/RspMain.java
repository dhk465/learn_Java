package ex7_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		// 가위 (s) | 바위 (r) | 보 (p) : p
		// 당신이 이겼습니다.
		// 1승 0무 0패
		// 다시 하시겠습니까? (y | n) : n
		// 게임을 종료합니다.
		
		String[] str = {"r", "s", "p"};
		
		RspInfo info = new RspInfo();
		RSP rsp;
		Scanner sc = new Scanner(System.in);
		int rand;
		String com;
		
		while (info.isPlaying()) {
			rand = new Random().nextInt(3);
			com = str[rand];
			
			System.out.print("가위 (s) | 바위 (r) | 보 (p) : ");
			
			rsp = new RSP(sc.next(), com);
			
			System.out.println();
			
			System.out.println(info.getWin() + "승 " + info.getDraw() + "무 " + info.getLose() + "패");
			
			System.out.print("다시 하시겠습니까? (y | n) : ");
			
			String play = sc.next();
			
			if (play.equalsIgnoreCase("y")) {
				continue;
			} else if (play.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("유효하지 않은 입력");
				System.out.println("게임을 다시 시작합니다.");
			}
			
		}
		
		
	}
}
