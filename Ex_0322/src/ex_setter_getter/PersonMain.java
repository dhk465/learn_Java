package ex_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.getInfo();
		
		System.out.println("----------------------------------");
		
		p1.setInfo("Lena", "lena.fab@gmail.com", 22);
		p1.getInfo();
		
		System.out.println("----------------------------------");
		
		Person p2 = new Person();
		p2.setInfo("Gabriel", "gabrey06@hotmail.com", 30);
	//	System.out.println(p2.email); private��������
		System.out.println("�̸�: " + p2.getName() + "\n�̸���: " + p2.getEmail());
		
		System.out.println("----------------------------------");
		
		Person p3 = new Person();
		p3.setName("Moira");
		p3.setAge(32);
		p3.getInfo();
		
	}
}
