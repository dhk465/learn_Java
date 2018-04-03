package ex1_value_type;

public class Ex1_ValueType {

	// �ڵ��ϼ� "main" + ctrl + space
	public static void main(String args[]) {
		
		// �⺻ �ڷ���
		/*
		
		����:	boolean		1 bit
		
		������:	char		2 bytes
		
		������:	byte		1 byte ((-128) ~ 127)
				short		2 bytes ((-32768) ~ 32767)
				int			4 bytes ((-21)�� ~ 21��)
				long		8 bytes ((-900)�� ~ 900��)
		
		�Ǽ���: 	float		4 bytes
		 		double		8 bytes
		
		*/
		
		// ����: ���� �����ϱ� ���� ����
		/*
		
		[���� ���� ��Ģ]
		
			����:		 	�ڷ��� ������;
		
			����:			������ = ��;
		
			����� ����:	�ڷ��� ������ = ��;
		
		** ���� �������� �ߺ��� �������� ����� �� ����.
		** ������ ���ڰ� ���� �� �� ����.
		** _�� �����ϰ� Ư�����ڸ� ������� �ʴ´�.
		** �������� (���Ļ�) �ѱ��̳� �ƶ������ ���ڷ� �̸����� �ʴ´�.
		
		[���� ǥ���]
		
			ī�� ǥ���: �� �ܾ��� ù���ڸ� �빮�ڷ� ǥ���ϰ� �ٿ�����, �� ó�� ���ڴ� �ҹ��ڷ� ǥ��
						���� ��� �빮�ڷ� �ܾ ����
			e.g.	textColor, typeName
			
			�Ľ�Į ǥ���: ù �ܾ �빮�ڷ� �����ϴ� ǥ��� (����x, Ŭ������ �������̽�� ����ϴ� ����)
			e.g.	TextColor, TypeName
			
			�밡���� ǥ���: ���� ����� ���ξ �ٿ��� �ǹ��ľ��� �ս��� �ϵ��� �ϴ� ǥ���
			e.g. 	boolean bTest;
					short sTest;
					float fTest;
					int nTest;
			
			������ũ ǥ���: �����ܾ�� �̷���� ���, �ܾ���̿� _�� �ٿ��� �����ϴ� ǥ���
			e.g.	text_color, type_name
		
		*/
		
		int number; // ����
		
		number = 100; // ����
		
		int number2 = 101;
		
		System.out.println(number + number2);
		
		System.out.println("--------------------------");
		
		
		// ����: true/false �� ���� ���� �� �� �ִ�.
		
		boolean bTest;
		bTest = false;
		
		System.out.println("���� bTest�� ��: " + bTest);

		System.out.println("--------------------------");
		
		
		// ������: Ȭ����ǥ �ȿ� �� ���ڸ� ������ �� �ִ� �ڷ���
		
		char ch = 'A';
		System.out.println("���� ch�� ��: " + ch);
		
		char ch2 = 65 + 1;
		System.out.println("���� ch2�� ��: " + ch2);

		System.out.println("--------------------------");
		
		
		// ������
		
		byte b = 127;
		short s = -32768;
		int num = 2100000000;
		long lNum = 2200000000l;
		
		
		// �Ǽ���
		
		float fNum = 3.14f;
		double dNum = 3.14;
		float fNum2 = 100;
		double dNum2 = 100;
		
		System.out.println(fNum2);
		
	}
		
}
