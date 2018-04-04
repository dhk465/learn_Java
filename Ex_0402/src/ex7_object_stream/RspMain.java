package ex7_object_stream;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		// 가위 (s) | 바위 (r) | 보 (p) : p
		// 당신이 이겼습니다.
		// 1승 0무 0패
		// 다시 하시겠습니까? (y | n) : n
		// 게임을 종료합니다.
		
		String[] str = {"바위","보","가위"};
		
		RspInfo info = new RspInfo();
		
		String id = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		id = sc.next();
		
		// 입력받은 id를 info객체에 저장
		info.setName(id);
		
		try {
			ScoreLoader loader = new ScoreLoader(info); // info의 name을 ScoreLoader에게 전달
			info = loader.getInfo(); // ScoreLoader를 통해 나머지 정보(.sav에 저장되어있던 정보)를 info에 대입***
			info.setPlaying(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("%d승 %d무 %d패\n", info.getWin(), info.getDraw(), info.getLose());
				
		System.out.println("------------------------------");
		
		while (info.isPlaying()) {
			int com = new Random().nextInt(3);
			
			System.out.print("가위 (s) | 바위 (r) | 보 (p) : ");
			
			info.result(sc.next(), com);
			
			System.out.println("com: " + str[com]);
						
			System.out.println();
			
			System.out.println(info.getWin() + "승 " + info.getDraw() + "무 " + info.getLose() + "패");
			
			System.out.println("------------------------------");
			
			System.out.print("한판더? (y | n) : ");
			
			String playAgain = sc.next();
			
			if (!playAgain.equalsIgnoreCase("y")) {
				info.setPlaying(false);
			}
			
			System.out.println("------------------------------");
			
		}
		
		System.out.println("게임 종료");
		
		// 저장
		try {
			new ScoreWriter( info );
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch : thrown from ScoreWriter
		
	}
}
