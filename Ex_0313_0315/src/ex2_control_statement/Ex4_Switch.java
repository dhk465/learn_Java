package ex2_control_statement;

public class Ex4_Switch {
	
	// if�� ���ӵ� ������ ����Ҷ� ����
	// switch�� ���ӵ��� ���� ������ ����Ҷ� ����
	
	public static void main(String[] args) {

		
		// ���� Ÿ�� - �ֽ� �������� �Ǽ� Ÿ�� ��� �Ұ�
		
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("1. �����ϱ�");
			break;
		case 2:
			System.out.println("2. ���ӼҰ�");
			break;
		case 3:
			System.out.println("3. ��������");
			break;
		default:
			System.out.println("�޴��� �ùٸ��� �������ּ���.");
			break;
		}
						
		System.out.println("------------------------");
		
		
		// ���ڿ� Ÿ��
		
		String str = "��";
		String res = "";
		
		switch (str) {
		case "��":
			res = "90-100";
			break;
		case "��":
			res = "80-89";
			break;
		case "��":
			res = "70-79";
			break;
		case "��":
			res = "60-69";
			break;
		case "��":
			res = "59�� ����";
			break;
		default:
			System.out.println("���� �Է��� �ùٸ��� �ʽ��ϴ�.");
			break;
		}
		
		System.out.println(res);
	
		System.out.println("------------------------");
		
		
		// ���� Ÿ��
		
		char ch = 'F';
		String score = "";
		
		switch (ch) {
		case 'A':
			score = "Supremacy";
			break;
		case 'B':
			score = "Excellent";
			break;
		case 'C':
			score = "Great";
			break;
		case 'D':
			score = "Well done";
			break;
		case 'E':
			score = "Uh oh";
			break;
		case 'F':
			score = "Failed";
			break;
		default:
			System.out.println("Not a valid input");
			break;
		}
		
		System.out.println(score);
		
	}
	
}
