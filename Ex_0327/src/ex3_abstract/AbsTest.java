package ex3_abstract;

abstract public class AbsTest {
	//�߻�޼��尡 �� �� �̻� ���ǵǾ� �ִ� Ŭ������ �߻� Ŭ������� �Ѵ�.
	//�߻� Ŭ���� ���� abstractŰ���带 ���� �ڽ��� �߻�Ŭ�������� �������� �Ѵ�.
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//�߻�޼���� body�� ���� - abstractŰ����� ���
	//�߻� �޼����� ����
	//abstract [��������] [��ȯ��] [�޼����]();
	//[��������] abstract [��ȯ��] [�޼����]();
	abstract public void setValue( int n );
	
	//�߻� �޼���� body�� ���� ������ �̸� "�̿ϼ��� ����"�̶�� �Ѵ�.
	//�׷��Ƿ� �� �̿ϼ������� �ڽ��� �޾Ƽ�
	//�ϼ���Ű�°��� �ϳ��� ������ �ȴ�.
	
}
















