package com.ioex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	private static final String SOURCE = "D:\\Front_WorkSpace\\myjava\\src\\com\\langex\\lambda\\stream\\FilterStreamEx.java";
	private static final String BACKUP = "D:\\ioRoot\\FilterStreamExWriterEx.back";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null; // 파일 객체 선언
		FileWriter fw = null;
		
		String msg = "안녕하세요. 이건 문자열";
		
		file = new File(BACKUP.substring(0,BACKUP.lastIndexOf("\\"))+"\\writer.txt"); // 저장 될 폴더

		try {
			fw = new FileWriter(file,true);
//			for(int i = 0; i<msg.length(); i++) {
//				fw.write(msg.charAt(i));
//			}
			fw.write("하하하하");
			System.out.println("파일작성완료");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
