package com.ioex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;



public class FileWriterEx2 {

	//private static final String SOURCE = "D:\\Front_WorkSpace\\myjava\\src\\com\\langex\\lambda\\stream\\FilterStreamEx.java";
	private static final String BACKUP = "D:\\ioRoot\\FilterStreamExWriterEx.back";
	private static Date log_date = new Date();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null; // 파일 객체 선언
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		
		file = new File(BACKUP.substring(0,BACKUP.lastIndexOf("\\"))+"\\msgLog.log"); // 저장 될 폴더
		System.out.println("지금부터 모든 대화는 저장 됩니다.");

		String msg = null;
		try {
			fw = new FileWriter(file);
			while(true) {
				System.out.print("메세지 입력 : ");
				msg = sc.nextLine();
				//입력된 문자열 분석
				if(msg.equalsIgnoreCase("q") || msg.equals("종료")) {
					//이 시점에 모든 기록을 종료하고 빠져나감.
					//혹시 모르니까, 기존의 내용은 flush();
					fw.write(msg);
					fw.flush();
					break;
				}else {
					///여기서부터 파일에 모두 저장작업.
					fw.write(msg + " : " + log_date.toLocaleString() + "\n\r");
					fw.flush();
				}
			}		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
