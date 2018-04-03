package ex1_innerclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_Anonymous {
	
	static int num = 0;
	
	public static void main(String[] args) {
		
		//내부클래스
		//특정 클래스 안에 또 다른 클래스가 정의되어 있는 것을 의미.
		//Member, Local, Static, Anonymous(익명)
		
		//익명 내부클래스
		//이름이 없는 클래스. 한번만 사용하고 버려지는 객체를 사용할 때 유용하게 쓰이는 내부클래스
		Frame f = new Frame();
		Button btn = new Button( "추가" );
		
		f.setSize(300, 300);
		f.add( btn );//프레임에 버튼을 추가
		f.setVisible( true );
		
		
		//버튼에 종료 기능 추가
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0); //창 종료
				System.out.println( ++num );
			}
			
		} );
	}
}

























