package ex3_abstract;

public class AbsChild extends AbsTest{

	int age = 10;
	
	//�߻� Ŭ������ ��ӹ��� �ڽ��� 
	//�θ��� �߻�Ŭ������ ������ �ִ� �߻�޼��带 ������ �޾Ƶ־� �Ѵ�.
	//����� ���� �ʴ´ٰ� �ϴ��� Overriding�� �� �־� �Ѵٴ� �ǹ�.
	@Override
	public void setValue(int n) {
		age += n;
	}

	@Override
	public int getValue() {
		return age;
	}

}
































