package ex8_bank;

public class Bank {
	private String location;
	private String phone_number;
	static float interest;
	
	public Bank(String location, String phone_number) {
		this.location = location;
		this.phone_number = phone_number;
	}
	
	public void getInfo() {
		System.out.println("����: " + location);
		System.out.println("��ȭ: " + phone_number);
		System.out.println("������: " + interest);
	}
	
}
