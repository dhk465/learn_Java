package ex2_control_statement;

public class Ex2_if_else {
	public static void main(String[] args) {
	
		int n = 48;
		String str = "";
		
		if (++n >= 50) {
			str = "n�� 50�̻��� ��";
		} else {
			str = "n�� 50�̸��� ��";
		}
		
		System.out.println(str);
		
		
		// ���� age�� ���̸� �����ϰ�, 30�� �̻��̸�
		// "��Ǹ�ŭ ��̳׿�."��, �׷��� ������ "�� ��ŵ� �˴ϴ�."�� ���
		// ���������� "�����մϴ�"�� ���ǿ� ������� ���
		
		int age = 36;
		str = "";
		
		if (age >= 30) {
			str = "��Ǹ�ŭ ��̳׿�.";
		} else {
			str = "�� ��ŵ� �˴ϴ�.";
		}

		System.out.println(str + "\n�����մϴ�.");
		
		
		// ���� ������ ���
		
		str = age >= 30 ? "��Ǹ�ŭ ��̳׿�." : "�� ��ŵ� �˴ϴ�.";
		System.out.println(str + "\n�����մϴ�.");
		
	}
}
