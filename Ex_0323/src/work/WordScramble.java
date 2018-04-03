package work;

import java.util.Random;

public class WordScramble {

	String[] strArr;
	String shake = "";
	
	public WordScramble( String[] arr ) {
		strArr = arr;
	}
	
	//���� ��ȯ �޼���
	public String getAnswer() {
		
		int idx = new Random().nextInt( strArr.length );
		return strArr[ idx ];
		
	}//getAnswer()
	
	//������ ��� ��ȯ�ϴ� �޼���
	public String getScrambleword( String str ) {
		
		int[] inArr = new int[ str.length() ];
		
		//������ �迭�� �� �濡 �ߺ����� �ʴ� ������ �ִ´�.
		outer : for( int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt( str.length() );
			
			for( int j = 0; j < i; j++ ) {
				
				if( inArr[i] == inArr[j] ) {
					continue outer;
				}
				
			}//inner
			
			i++;
			
		}//outer
		
		for( int i = 0; i < str.length(); i++ ) {
			
			shake += str.charAt( inArr[i] );
			
		}
		
		return shake;
		
	}//getScrambleword()
	
}













































