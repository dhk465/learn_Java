package ex4_overload;

public class Bread {
	
	public Bread() {
		System.out.println("���� ������?");
	}
	
	public Bread(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("���� ������?");
		}
		System.out.printf("%d���� ���� ������?\n", number);
	}
	
	public Bread(int number, String name) {
		for (int i = 0; i < number; i++) {
			System.out.printf("%s�� ������?.\n", name);
		}
		System.out.printf("%d���� %s�� ������?\n", number, name);
	}
	
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}
	
	public void makeBread(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�.\n", number);
	}
	
	public void makeBread(int number, String name) {
		for (int i = 0; i < number; i++) {
			System.out.printf("%s�� ��������ϴ�.\n", name);
		}
		System.out.printf("��û�Ͻ� %d���� %s�� ��������ϴ�.\n", number, name);
	}
}
