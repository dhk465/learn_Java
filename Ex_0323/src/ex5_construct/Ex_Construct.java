package ex5_construct;

public class Ex_Construct {
	// 객체가 생성될 때 메모리 할당 및 멤버변수를 초기화하기위해 사용
	// ***객체가 생성될때 딱 한번만 호출
	
	private int age;
	
	public Ex_Construct() {
		// 생성자는 반환형을 가질 수 없다.
		System.out.println("기본 생성자 호출");
		
		age = 10;
	}
	
	public int getAge() {
		return age;
	}
}
