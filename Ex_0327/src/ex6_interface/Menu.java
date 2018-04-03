package ex6_interface;

public interface Menu extends Menu2, Menu3{
	//abstract키워드가 빠져있어도 인터페이스에서는 추상메서드로 인정
	//인터페이스는 구현능력이 없기 때문에 다중상속이 가능하다.
	String jjajang();
	String jjambbong();
	String tangsuyuck();
	String boggembab();
	
}
