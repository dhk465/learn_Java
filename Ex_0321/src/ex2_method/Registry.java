package ex2_method;

public class Registry {
	String[] member = {"Hong", "Kim", "Park"};
	
	public String isRegistered(String id) {
		for (int i = 0; i < member.length; i++) {
			if (id.equalsIgnoreCase(member[i])) {
				return "�̹� �����ϴ� ID";
			}
		}
		return "������ ������ ID";
	}
}
