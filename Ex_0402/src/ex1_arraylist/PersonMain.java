package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person p = null;
		ArrayList<Person> pArr = new ArrayList<>();
		
		AddPerson ap = new AddPerson();
		
		while( true ) {
			
			System.out.println("1.�����߰�");
			System.out.println("2.��������");
			System.out.println("3.��ü����");
			System.out.println("etc.��   ��");
			System.out.print(">> ");
			
			switch( sc.nextInt() ) {
			
			case 1://�߰�
				ap.addPerson(p, pArr, sc);
				break;
				
			case 2://����	
					System.out.println("---��������---");
					System.out.print("��ȭ��ȣ : ");
					String phone = sc.next();
					
					for (int i = 0; i < pArr.size(); i++) {
						
						if (pArr.get(i).getTel().equals(phone)) {
							
							System.out.println(pArr.get(i).getName() + "�� ���� ������");
							pArr.remove(i);
						
						} else {
							if (i + 1 == pArr.size()) {
								System.out.println(phone + "(��)�� �������� �ʽ��ϴ�.");
							}
						}
					
					}//for
				break;
				
			case 3://��ü����
				System.out.println("---��ü����---");
				System.out.println("����ο� : " + pArr.size() + "��");
				
				for( int i = 0; i < pArr.size(); i++ ) {
					
					System.out.printf("%s\t%d\t%s", 
							          pArr.get(i).getName(), 
							          pArr.get(i).getAge(), 
							          pArr.get(i).getTel());
					System.out.println();
					
				}//for
				
				System.out.println("-----------------------");
				break;
				
			default:
				System.out.println("���α׷� ����");
				return;
			
			}//switch
			
		}//while
		
	}//main
}



















































