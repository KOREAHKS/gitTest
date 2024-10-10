package com.langex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.clsex.Animal;
import com.clsex.Cat;

import my_lib.userlib.MyClassA;

/*
 *  자바 Reflection : 자바에서는 실행시에 주어진 특정 클래스를 Class 객체로 생성해서, 원할시엔 해당 클래스의 내용부를 읽어내고,
 *  호출 할 수도 있다. 이를 reflection 이라고 하는데, 이를 가능하게 하는 클래스가 java.lang 의 Class class 이다.
 *   
 *  위에서처럼 Class 객체를 생성하는 방법은 아래처럼 3개중 하나를 이용해서 할 수 있다.
 *  
 *  1.Class.class 호출
 *  2.Class.forName("패키지를 포함한 클래스명")
 *  3.ref변수.getClass()
 */
public class ReflectExam {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Class cls = null;
		
		cls = ReflectExam.class;
		System.out.println(cls);
		
		cls = Class.forName("com.clsex.Animal");
		System.out.println(cls);
		
		Animal cat = new Cat(null, null);
		cls.getClass();
		System.out.println(cat);
		
		MyClassA a = new MyClassA();
		
		Class cls2 = Class.forName("my_lib.userlib.MyClassA");
		System.out.println(cls2);
	
		
		//클래스와 같은 경로에 있는 자원에 대한 path 정보 얻어내보기
		Class resCls = ReflectExam.class;
		String imgPath = resCls.getResource("1.jpg").getPath();
		System.out.println(imgPath);
		
		File dist = new File("D:\\test\\","2.jpg");
		InputStream ins = resCls.getResourceAsStream("1.jpg");
		
		FileOutputStream fos = new FileOutputStream(dist);
		int data;
		while((data = ins.read())!= -1) {
			fos.write(data);
		}
		fos.close();
		ins.close();
		
		System.out.println("파일 복사 완료..확인해봐");
		
		
		
		
		
		
		
		
		
	}

}
