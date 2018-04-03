package ex3_overload;

public class Ex_Overloading {
	
	// 메서드의 오버로딩은 "중복정의"라고 하며, 
	// 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의 되는 것을 말한다.
	// 효율성이 높아짐
	
	public void getResult() {
		System.out.println("a method without any parameter");
	}
	
	public void getResult(int num) {
		System.out.println("a method with an int parameter");
	}
	
	public void getResult(char c) {
		System.out.println("a method with a char parameter");
	}
	
/*	public void getResult(char ch) {
		System.out.println("a method with an char parameter");
	}

	char type not allowed to overload the method above with another char type*/
	
	public void getResult(String str) {
		System.out.println("a method with a string parameter");
	}
	
	public void getResult(String str, int num) {
		System.out.println("a method with a string and an int parameter");
	}
	
	public void getResult(int num, String str) {
		System.out.println("a method with an int and an string parameter");
	}
}


