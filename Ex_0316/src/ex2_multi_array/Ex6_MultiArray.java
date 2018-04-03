package ex2_multi_array;

import java.util.Scanner;

public class Ex6_MultiArray {
	public static void main(String[] args) {
		
		// 학생들의 수학+영어성적을 등록하는 프로그램
		// 프로그램을 실행하면 몇명의 정보를 저장할지 입력받고
		// 입력받은 수 만큼 이름, 수학, 영어성적을 등록
		// 유지 보수가 쉬운 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 학생 수를 입력하세요: ");
		int num = sc.nextInt();
		String[] subject = {"국어", "수학", "영어", "제2외국어"};
		String[][] grade = new String[num][subject.length + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("학생이름: ");
			grade[i][0] = sc.next();
			for (int j = 0; j < subject.length; j++) {
				System.out.printf("%s성적: ", subject[j]);
				String score = sc.next();
				grade[i][j+1] = score;
			}
			System.out.println("-------------------");
		}
		
		System.out.println(num + "명 등록 완료!!");
		System.out.printf("이름\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		} // 이름 + 과목명 타이틀 출력
		System.out.println();
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("%s\t", grade[i][0]); // 학생 이름 출력
			for (int j = 0; j < subject.length; j++) {
				System.out.printf("%s\t", grade[i][j+1]);
			} // 위 i 학생의 성적, 과목별로 출력
			System.out.println();
		}
		
	}
}
