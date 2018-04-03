package ex3_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		//추상클래스는 자신의 기능을 자식이 완성 시키도록
		//조건부 상속하여 자식클래스가 생성될 때 함께 객체화 된다.
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
