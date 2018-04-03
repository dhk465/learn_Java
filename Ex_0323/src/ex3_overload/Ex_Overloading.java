package ex3_overload;

public class Ex_Overloading {
	
	// �޼����� �����ε��� "�ߺ�����"��� �ϸ�, 
	// �ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡 ������ ���� �Ǵ� ���� ���Ѵ�.
	// ȿ������ ������
	
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


