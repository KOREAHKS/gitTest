package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 프로그램으로 data 가 in 될때는 InputStream 객체 타입으로 생성
 * 반대인 경우엔 OuputStream 타입으로 생성함.
 * In-OutputStream 은 모두 추가 클래스임.
 * 이유는 내부에 존재하는 read() 가 추상임.
 * 때문에 어디로부터(source) 읽을지는 모두 하위 클래스로 정의 되어짐 
 * out도 마찬가지.
 * 
 * 일단 스트림이 연결되면, 스트림 내부에는 기본적으로 설정된 바이트 만큼이 채워짐
 * 
 * 이 스트림에 있는 데이터를 read or write 를 통해 읽거나 쓰는게 스트림의 전부임.
 */
public class IOStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("first.dat");
			
			//byte[] 를 이용해서 한 번에 주어진 배열만큼을 write() 하도록 처리함.
			String myName = "한경수";
			byte[] nameByte = myName.getBytes();
			
			nameByte = new byte[] {1,2,3,4,5,6,7,8,9,10,11};
			
			System.out.println(nameByte.length);
			
			
			//스트림의 경로를 변경합니다.
			out = new FileOutputStream("D:\\ioRoot\\namedtd.dat");
			
		
			
			out.write(nameByte,0,nameByte.length);  // 0 바이트부터 5 바이트까지만 읽음
			out.close();
			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;
//			
//			// 1byte 씩 out..
//			out.write(a);
//			out.write(b);
//			out.write(c);
//			
//			out.flush();
//			out.close(); // 코드에 보면 close() 첫 머리에는 flush() 호출하도록 되어있음.
			// 즉 close() 를 호출하면, 자동으로 flush() 가 먼저 호출됨..
			// 그럼 이 flush() 는 언제 쓸까??? 열려진 스트림을 닫지 않고 지속적으로 스트림내의 데이터를
			// write() 와 함께 강제 배출할때만 사용함
			// 즉, 로직에선 close() 를 바로 사용하지 않을때만 write() + flush() 를 병행함.
			System.out.println("파일 다씀");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
