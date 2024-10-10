package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream : 자바에서 표준 콘솔 출력을 담당하는 Stream 클래스
 * 여러분이 콘솔에 syso 시 사용되는 객체가 System.out(PrintStream) 임
 * 이 스트림은 콘솔에 자바의 모든 데이터를 출력 하도록 정의가 되어있기 때문에,
 * println() 이라는 메서드는 각 타입에 맞게 오버로딩해서 모두 콘솔에 출력하도록 되어있음.
 * 
 *  이 스트림을 이용하면 꼭 콘솔이 아니어도, 파일이나 기타 다른 곳으로도 print or println() 을 이용해서 출력시킬 수 있음
 *  
 *  이놈과 똑같은 기능을 하는 Writer 은 PrintWriter 임.
 */
public class PrintStreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(new FileOutputStream("printStr.data"),true);
		
		ps.println("안녕");
		ps.print(false);
		ps.println(new PrintStreamEx());
		
		ps.close();
	}

}
