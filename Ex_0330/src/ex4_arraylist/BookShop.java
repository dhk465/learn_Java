package ex4_arraylist;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		
		Book b001 = new Book("ȫ�浿��", 10000);
		Book b002 = new Book("���ֺ���", 7000);
		
		list.add(b001);
		list.add(b002);
		
		System.out.println("����\t\t����");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle() + "\t\t" + list.get(i).getPrice());	
		}
		
	}
}