package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPerson {
	
	public void addPerson( Person p, ArrayList<Person> pArr, Scanner sc  ) {
		
		p = new Person();
		
		System.out.println("---���� �߰�---");
		System.out.print("�̸� : ");
		p.setName( sc.next() );
		
		System.out.print("���� : ");
		p.setAge( sc.nextInt() );
		
		System.out.print("��ȭ : ");
		p.setTel( sc.next() );
		
		//arrayList�� Person��ü�� ����
		pArr.add( p );
		
		System.out.println("���� ���� �Ϸ�");
		
		System.out.println("-----------------------");
		
	}//addPerson()
	
}
