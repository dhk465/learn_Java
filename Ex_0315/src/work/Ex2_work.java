package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("������ �Է��ϼ���: ");
			int num = sc.nextInt();
			int i;
			for (i = 2; i < num + 1; i++) {
				if (num % i == 0) {
						break;
				}
			}
			
			if (i == num && num > 0) {
				System.out.printf("%d�� �Ҽ��Դϴ�.\n", num);
			} else {
				System.out.printf("%d�� �Ҽ��� �ƴմϴ�.\n", num);
			}
		}
		
		
	}
}
