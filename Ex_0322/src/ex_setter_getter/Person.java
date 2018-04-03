package ex_setter_getter;

public class Person {
	private String name = "";
	private String email = "";
	private int age;
	private String tel = "";
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTel() {
		return tel;
	}

	public void getInfo() {
		System.out.println("이름:\t" + name);
		System.out.println("이메일:\t" + email);
		System.out.println("나이:\t" + age);
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setInfo(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
}
