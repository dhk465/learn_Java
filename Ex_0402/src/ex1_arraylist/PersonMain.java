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
			
			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("etc.종   료");
			System.out.print(">> ");
			
			switch( sc.nextInt() ) {
			
			case 1://추가
				ap.addPerson(p, pArr, sc);
				break;
				
			case 2://삭제	
					System.out.println("---정보삭제---");
					System.out.print("전화번호 : ");
					String phone = sc.next();
					
					for (int i = 0; i < pArr.size(); i++) {
						
						if (pArr.get(i).getTel().equals(phone)) {
							
							System.out.println(pArr.get(i).getName() + "의 정보 삭제함");
							pArr.remove(i);
						
						} else {
							if (i + 1 == pArr.size()) {
								System.out.println(phone + "(이)가 존재하지 않습니다.");
							}
						}
					
					}//for
				break;
				
			case 3://전체정보
				System.out.println("---전체정보---");
				System.out.println("등록인원 : " + pArr.size() + "명");
				
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
				System.out.println("프로그램 종료");
				return;
			
			}//switch
			
		}//while
		
	}//main
}



















































