package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPerson {
	
	public void addPerson( Person p, ArrayList<Person> pArr, Scanner sc  ) {
		
		p = new Person();
		
		System.out.println("---정보 추가---");
		System.out.print("이름 : ");
		p.setName( sc.next() );
		
		System.out.print("나이 : ");
		p.setAge( sc.nextInt() );
		
		System.out.print("전화 : ");
		p.setTel( sc.next() );
		
		//arrayList에 Person객체를 저장
		pArr.add( p );
		
		System.out.println("정보 저장 완료");
		
		System.out.println("-----------------------");
		
	}//addPerson()
	
}
