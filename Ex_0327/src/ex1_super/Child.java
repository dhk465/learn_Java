package ex1_super;

public class Child extends Parent{

	public Child() {
		
		//super�� ��Ӱ����� �θ�Ŭ����
		super( 10 );
		System.out.println("�ڽ�Ŭ���� ������");
		
	}
	
	@Override
	public String getResult() {
		//�θ�Ŭ������ ������ �ִ� getResult()�޼��� ȣ��
		//return super.getResult();
		return "�ڽ�";
	}
	
}











