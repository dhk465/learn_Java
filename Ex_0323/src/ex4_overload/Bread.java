package ex4_overload;

public class Bread {
	
	public Bread() {
		System.out.println("빵을 만들까요?");
	}
	
	public Bread(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("빵을 만들까요?");
		}
		System.out.printf("%d개의 빵을 만들까요?\n", number);
	}
	
	public Bread(int number, String name) {
		for (int i = 0; i < number; i++) {
			System.out.printf("%s을 만들까요?.\n", name);
		}
		System.out.printf("%d개의 %s을 만들까요?\n", number, name);
	}
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	public void makeBread(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", number);
	}
	
	public void makeBread(int number, String name) {
		for (int i = 0; i < number; i++) {
			System.out.printf("%s을 만들었습니다.\n", name);
		}
		System.out.printf("요청하신 %d개의 %s을 만들었습니다.\n", number, name);
	}
}
