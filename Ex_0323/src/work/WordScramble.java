package work;

import java.util.Random;

public class WordScramble {

	String[] strArr;
	String shake = "";
	
	public WordScramble( String[] arr ) {
		strArr = arr;
	}
	
	//정답 반환 메서드
	public String getAnswer() {
		
		int idx = new Random().nextInt( strArr.length );
		return strArr[ idx ];
		
	}//getAnswer()
	
	//문제를 섞어서 반환하는 메서드
	public String getScrambleword( String str ) {
		
		int[] inArr = new int[ str.length() ];
		
		//만들어둔 배열의 각 방에 중복되지 않는 난수를 넣는다.
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













































