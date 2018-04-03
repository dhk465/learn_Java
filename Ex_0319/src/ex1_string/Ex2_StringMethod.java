package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/ ����
		String str = "Hong Gil Dong";
		int index = str.length();
		System.out.println("str�� ����: " + index);
		
		index = str.indexOf('g');
		System.out.println("�� ó�� ���� g�� ��ġ: " + index);
		
		index = str.indexOf("Gil");
		System.out.println("�� ó�� ���� Gil�� ��ġ: " + index);
		
		index = str.lastIndexOf('g');
		System.out.println("�� ������ ���� g�� ��ġ " + index);
		
		char ch = str.charAt(5);
		System.out.println("5��° ��ġ�� ����: " + ch); // 0�� ���� ����
		
		String str2 = " ȫ �� �� ";
		String trim_str = str2.trim();
		System.out.println(trim_str.length()); // �Ǿհ� �ǵ��� �ǹ� ���� ���� ����, ���� ������ ���� ���� �Ұ�
		
		str2 = str.substring(0, 6);
		System.out.println("0���� 5��°���� ����: " + str2);
		
		String apple1 = "apple";
		String apple2 = "Apple";
		
		if (apple1.equalsIgnoreCase(apple2)) {
			System.out.printf("%s�� %s�� (��ҹ��ڸ� ������) ���� ����.\n", apple1, apple2);
		} else {
			System.out.printf("%s�� %s�� (��ҹ��ڸ� ������) ���� �ٸ���.\n", apple1, apple2);
		}
		
		String[] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		str = "Hong:Gil:Dong";
		arr = str.split(":");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// ���ڿ� ���� -> ���� ��ȯ
		
		String number = "70";
		int n = Integer.parseInt(number);
	//	System.out.printf("number (string) + 30 = %d\n", number + 30); // Exception
		System.out.printf("n (parseInt(number)) + 30 = %d\n", n + 30);
	}
}
