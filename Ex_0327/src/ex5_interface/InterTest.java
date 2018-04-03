package ex5_interface;

public interface InterTest {
	//인터페이스는 추상클래스와 유사하지만, 서비스 요청에 따른
	//중개자 역할을 한다.
	
	//인터페이스에는 상수와 추상메서드만 포함시킬 수 있다.
	final int VALUE = 100;
	abstract int getValue();
	
}
