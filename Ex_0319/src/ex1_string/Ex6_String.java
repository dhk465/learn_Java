package ex1_string;

import java.util.Scanner;

public class Ex6_String {
	public static void main(String[] args) {
		
		String[][] actor = {{"[�۰�ȣ]", "����", "����", "����"}, 
							{"[�̺���]","����", "G.I.Joe", "����"},
							{"[������]", "�������α׳�", "������ģ�����Ұ��մϴ�", "���ϵ�"}};
	
		// ���˻�: �̸�
		// [�̸�]
		// ��ȭ1
		// ��ȭ2
		// ��ȭ3
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �˻�: ");
		String actName = sc.next().trim();
		
		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].equals("[" + actName + "]")) {
				
				for (int j = 0; j < actor[i].length; j++) {
					
					System.out.println(actor[i][j]);
					
				}
				
			} else {
				
				count++;
				
				if (count == actor.length)
				System.out.println("�˻��� ��ġ�ϴ� ��찡 �����ϴ�.");
				
			}
			
		}
		
	}
}
