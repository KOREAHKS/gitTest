package com.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileInoutEx {

	private static final String SOURCE = "D:\\Front_WorkSpace\\myjava\\src\\com\\langex\\lambda\\stream\\FilterStreamEx.java";
	private static final String BACKUP = "D:\\ioRoot\\FilterStreamEx.back";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte readArr[] = new byte[1000];
		InputStream fileInput = null;
		OutputStream fileOut = null;
		try {
			fileInput = new FileInputStream(SOURCE);
			fileOut = new FileOutputStream(BACKUP);
			int readData = -1;
			
			//fileInput.transferTo(System.err);  //콘솔창에 error 처럼 보이게 색이 빨간색으로 적용되어 출력됨
			fileInput.transferTo(System.out); //콘솔창에 보여지기
			//fileInput.transferTo(fileOut);
			
//			while((readData = fileInput.read(readArr)) != -1) {
//				System.out.println("읽은 갯수 : " + readData);
//				for(byte b : readArr) {
//					System.out.print((char)b);
//				}
//				
//				// 읽은 내용을 그대로 쓰기..
//				fileOut.write(readArr);
//			}
			
			fileInput.close();
			fileOut.close();
			
			System.out.println("작업완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
