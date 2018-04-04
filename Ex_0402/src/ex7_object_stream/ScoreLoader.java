package ex7_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ex2_io.FilePath;

public class ScoreLoader {
	
	private RspInfo info;
	
	public RspInfo getInfo() {
		return info;
	}
	
	public ScoreLoader(RspInfo info) throws IOException {
		
		this.info = info;
		
		// RspScore/userID/userinfo.sav
		String path = FilePath.PATH + "/RspScore/" + info.getName() + "/userinfo.sav";
	
		File f = new File(path);
		
		if(f.exists()) {
		
			ObjectInputStream ois = null;
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				
				this.info = (RspInfo)ois.readObject();
				
				System.out.println("로드 성공");
			
			} catch (Exception e) {
				System.out.println("로드 실패");
			} finally {
			
				if (ois != null) {
					ois.close();
				}
				if (ois != null) {
					fis.close();
				}
				
			}
			
		} else {
			System.out.println("Welcome, " + info.getName());
		}
		
	}
	
}
