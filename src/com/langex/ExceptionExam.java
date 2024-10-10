package com.langex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionExam {
	
	private static final String MEMBER_PATH = "C:\\member";
	
	private static boolean mkDirOK = false;
	
	private static boolean isNew = false;
	
	private static String email = null;
	
	private static String password = null;
	
	private static boolean makeDir() {
		File dir = new File(MEMBER_PATH);
		return dir.mkdir();
	}
	private static void checkMember(File user) throws IOException{
		if(!user.exists()) {
			// 신규 유저 파일을 생성하도록 메서드 호출함
			createUser(user);
		}
	}
	
	private static void createUser(File user) {
		//파일에 데이터를 쓰는 Stream 을 이용해서, 신규 유저의 파일을 생성합니다.
		FileWriter fw = null;
		FileInputStream fis = null;
		try {
			fw  = new FileWriter(user);
			fis = new FileInputStream(user);
			Date reg_date = new Date();
			
			fw.write("암호:" + password + "\r\n" + "가입일:" + reg_date.getTime());
			fw.close();
		}catch(Exception ff) {
			ff.printStackTrace();
			System.out.println(ff.getMessage());
		}finally { // 예외 발생여부와 상관없이 무조건 실행되는 코드를 여기에 기입함
			System.out.println("finally 실행됨");
		}
		
		
		System.out.println("파일 확인해보세요");
		
	}
	public static void main(String[] args) throws IOException{
		
		//System.out.println("ID(Email)과 Pass 입력 하세요");
		String id = JOptionPane.showInputDialog("ID(Email) 입력");
		String pw = JOptionPane.showInputDialog("암호 입력");
		
		//위의 사용자를 관리하는 폴더가 있는지를 확인해볼게요.
		//만약에 없다면 새로 생성할게요.
		File dir = new File(MEMBER_PATH); // 파일에 관련된 모든 일을 하는애..
		//단 파일에 데이터 입출력은 불가함...파일에 대한 정보와 빈 파일, 폴더만 생성 가능한 애임
		
		File user = new File(dir, id+".dat");
		//폴더내에 사용자 ID에 해당하는 파일이 존재 하는지 여부와, 그 이후(읽고, 쓰고)의 대상이 되는 파일 객체 생성
		
		if(!dir.exists()) {
			//폴더가 존재하지 않으니, 새로 생성함
			mkDirOK = makeDir();
			if(mkDirOK) {
				System.out.println("폴더 확인해 보삼");
			}
		}else {
			//폴더가 이미 존재한다면..입력된 ID 의 파일이 존재하는지 확인해 봄
			//System.out.println(checkMember(user));  
			//email = id;
			password = pw;
			checkMember(user);
			
		}
		
		
		
	}
}
