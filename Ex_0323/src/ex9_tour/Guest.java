package ex9_tour;

public class Guest {

	private String name;
	private int age;
	private String point;
	
	public String getPoint() {
		point = Guide.point;
		return point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
