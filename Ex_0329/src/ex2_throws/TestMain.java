package ex2_throws;

public class TestMain {
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		try {
			t1.getRes();
			t2.getRes();
		} catch (Exception e) {
			System.out.println("정수만 입력하세요.");
		}
	}
}
