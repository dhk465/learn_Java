package ex7_object_stream;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		// ���� (s) | ���� (r) | �� (p) : p
		// ����� �̰���ϴ�.
		// 1�� 0�� 0��
		// �ٽ� �Ͻðڽ��ϱ�? (y | n) : n
		// ������ �����մϴ�.
		
		String[] str = {"����","��","����"};
		
		RspInfo info = new RspInfo();
		
		String id = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		id = sc.next();
		
		// �Է¹��� id�� info��ü�� ����
		info.setName(id);
		
		try {
			ScoreLoader loader = new ScoreLoader(info); // info�� name�� ScoreLoader���� ����
			info = loader.getInfo(); // ScoreLoader�� ���� ������ ����(.sav�� ����Ǿ��ִ� ����)�� info�� ����***
			info.setPlaying(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("%d�� %d�� %d��\n", info.getWin(), info.getDraw(), info.getLose());
				
		System.out.println("------------------------------");
		
		while (info.isPlaying()) {
			int com = new Random().nextInt(3);
			
			System.out.print("���� (s) | ���� (r) | �� (p) : ");
			
			info.result(sc.next(), com);
			
			System.out.println("com: " + str[com]);
						
			System.out.println();
			
			System.out.println(info.getWin() + "�� " + info.getDraw() + "�� " + info.getLose() + "��");
			
			System.out.println("------------------------------");
			
			System.out.print("���Ǵ�? (y | n) : ");
			
			String playAgain = sc.next();
			
			if (!playAgain.equalsIgnoreCase("y")) {
				info.setPlaying(false);
			}
			
			System.out.println("------------------------------");
			
		}
		
		System.out.println("���� ����");
		
		// ����
		try {
			new ScoreWriter( info );
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch : thrown from ScoreWriter
		
	}
}
