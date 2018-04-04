package ex7_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ex2_io.FilePath;

public class ScoreWriter {
	
	public ScoreWriter(RspInfo info) throws IOException {
		
		// RspScore/userID/userinfo.sav
		
		String path = FilePath.PATH + "/RspScore/" + info.getName() + "/userinfo.sav";
		
		File dir = new File(FilePath.PATH + "/RspScore");
		
		if (!dir.exists()) {
			dir.mkdirs();
		} // RspScore 디렉토리가 없다면 만들어 준다.
		
		File dir2 = new File(dir, info.getName());
		
		if (!dir2.exists()) {
			dir2.mkdirs();
		} // 유저폴더가 없다면 만들어 준다.
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			// RspInfo객체인 info를 파일로 기록
			
			oos.writeObject(info);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("기록저장 실패");
			
		} finally {
			
			if (oos != null) {
				oos.close();
			}
			if (fos != null) {
				fos.close();
			}
 			
		}
		
		
	}
	
	
	
}
