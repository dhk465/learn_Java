package ex3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(110); // �ߺ��� �� ���
		
		list.remove(1);// 1�� �ε����� ��(110)�� ������ �� ���� �ε������� (i - 1)�� �� �ȴ�.
		
		System.out.println("size: " + list.size());
		System.out.println(list);
		
		list.add(2, 102); // 2�� �ε��� �濡 102�� �־��ش�. ���� �� ��� �޹��� ����ִ� ���� (i + 1)�� ������ �Ѿ��.
		
		list.set(0, 155); // 0�� �ε��� ���� ���� 155�� �ٲپ��ش�.
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		} // for-loop
		
		boolean con = list.contains(127); // ���� list�� 127 ���� ���� �Ѵٸ� true �ƴϸ� false
		
		list.clear(); // list�� ����.
		System.out.println("\nsize: " + list.size());
		
		System.out.println("----------------------");
		
		List<String> arr = new ArrayList<>(); // ���� ���� ������� �޸� ����� '��'�ϴ�.
		arr.add("ȫ�浿");
		arr.add("��浿");
		System.out.println(arr);
		
	}
}