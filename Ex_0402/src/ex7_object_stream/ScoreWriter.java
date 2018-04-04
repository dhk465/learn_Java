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
		} // RspScore ���丮�� ���ٸ� ����� �ش�.
		
		File dir2 = new File(dir, info.getName());
		
		if (!dir2.exists()) {
			dir2.mkdirs();
		} // ���������� ���ٸ� ����� �ش�.
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			// RspInfo��ü�� info�� ���Ϸ� ���
			
			oos.writeObject(info);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("������� ����");
			
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
