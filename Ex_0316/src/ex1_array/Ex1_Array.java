package ex1_array;

public class Ex1_Array {
	public static void main(String[] args) {
		
		// �迭 ���� (stack)
		int[] su;
		
		// �迭 ���� (heap)
		su = new int[10];
		
		// �迭 �ʱ�ȭ
		su[0] = 100;
		su[1] = 200;
		su[2] = 300;
		su[3] = 400;
		
		// su[4] = 500; -> Exception: �������� �ʴ� index ���� ����
		
		// �迭�� ��� ������ ȭ�鿡 for-loop�� �̿��� ���
		for (int i = 0; i < su.length; i++) {
			su[i] = (i + 1) * 100;
			System.out.println(su[i]);
		}
		
	}
}
