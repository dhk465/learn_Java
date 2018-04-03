package ex7_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		// ���� (s) | ���� (r) | �� (p) : p
		// ����� �̰���ϴ�.
		// 1�� 0�� 0��
		// �ٽ� �Ͻðڽ��ϱ�? (y | n) : n
		// ������ �����մϴ�.
		
		String[] str = {"r", "s", "p"};
		
		RspInfo info = new RspInfo();
		RSP rsp;
		Scanner sc = new Scanner(System.in);
		int rand;
		String com;
		
		while (info.isPlaying()) {
			rand = new Random().nextInt(3);
			com = str[rand];
			
			System.out.print("���� (s) | ���� (r) | �� (p) : ");
			
			rsp = new RSP(sc.next(), com);
			
			System.out.println();
			
			System.out.println(info.getWin() + "�� " + info.getDraw() + "�� " + info.getLose() + "��");
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (y | n) : ");
			
			String play = sc.next();
			
			if (play.equalsIgnoreCase("y")) {
				continue;
			} else if (play.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("��ȿ���� ���� �Է�");
				System.out.println("������ �ٽ� �����մϴ�.");
			}
			
		}
		
		
	}
}
