package ex3_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//�߻�Ŭ������ �ڽ��� ����� �ڽ��� �ϼ� ��Ű����
		//���Ǻ� ����Ͽ� �ڽ�Ŭ������ ������ �� �Բ� ��üȭ �ȴ�.
		AbsChild ch = new AbsChild();
		ch.setValue(10);
		System.out.println( ch.getValue() );
		
		AbsTest p = new AbsTest() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
	}//main
}
