package ex1_innerclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_Anonymous {
	
	static int num = 0;
	
	public static void main(String[] args) {
		
		//����Ŭ����
		//Ư�� Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���ǵǾ� �ִ� ���� �ǹ�.
		//Member, Local, Static, Anonymous(�͸�)
		
		//�͸� ����Ŭ����
		//�̸��� ���� Ŭ����. �ѹ��� ����ϰ� �������� ��ü�� ����� �� �����ϰ� ���̴� ����Ŭ����
		Frame f = new Frame();
		Button btn = new Button( "�߰�" );
		
		f.setSize(300, 300);
		f.add( btn );//�����ӿ� ��ư�� �߰�
		f.setVisible( true );
		
		
		//��ư�� ���� ��� �߰�
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0); //â ����
				System.out.println( ++num );
			}
			
		} );
	}
}

























