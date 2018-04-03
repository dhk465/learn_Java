package ex2_method;

public class Registry {
	String[] member = {"Hong", "Kim", "Park"};
	
	public String isRegistered(String id) {
		for (int i = 0; i < member.length; i++) {
			if (id.equalsIgnoreCase(member[i])) {
				return "이미 존재하는 ID";
			}
		}
		return "가입이 가능한 ID";
	}
}
