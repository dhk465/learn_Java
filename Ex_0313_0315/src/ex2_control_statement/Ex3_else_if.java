package ex2_control_statement;

public class Ex3_else_if {

	public static void main(String[] args) {
		
		int num = 75;
		String str= "";
		
		if (num >= 90) {
			str = "��";
		} else if (num >= 80) {
			str = "��";
		} else if (num >= 70) {
			str = "��"; // else-if ���� ���� ������ �Ʒ� ���ǵ��� ��� ����
		} else if (num >= 60) {
			str = "��";
		} else {
			str = "��";
		}
	
		System.out.println(str);
		
	}
		
}
