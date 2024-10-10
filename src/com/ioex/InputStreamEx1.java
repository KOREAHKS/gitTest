package com.ioex;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/*
 * InputStream 을 이용한 예시.
 * InputStream 타입을 이용해서 데이터를 읽을때 주의 해야할것은 read() 임.
 * 이 메서드는 한 번 호출시마다 스틑림으로부터 1byte 를 읽어서 int 로 되돌림.
 * 보통 많이 헷갈려하는 부분이 byte 로 읽었는데, int로 주는것에 대해서임.
 * 꼭 기억하길 바람..
 * 
 * 마지막으로 스트림 내부에 더 이상 읽을 byte 가 없을시엔 -1을 리턴함
 * 
 * 이 값을 이용해서 스트림의 끝 여부를 확인할 수 있음.
 * 
 */
public class InputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream fileInput = new FileInputStream("D:\\ioRoot\\namedtd.dat");
		
//			while(true) {
//				int data = fileInput.read();
//			
//			//스트림의 끝인지를 확인
//				if(data == -1)
//					break;
//				System.out.println(data);
//			}
			int data = 0;
//			while((data = fileInput.read()) != -1) {
//				System.out.println(data);
//			}
			
			// 바이트 배열을 이용해서 읽어보기.
			byte[] readArr = new byte[5];
			while((data = fileInput.read(readArr))!= -1) {
				System.out.println("새롭게 읽은 바이트 배열의 갯수 : " + data);
				System.out.println("읽어서 담겨진 배열의 값 : " + Arrays.toString(readArr));
			}
			
			fileInput.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	}

