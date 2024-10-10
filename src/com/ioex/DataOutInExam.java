package com.ioex;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * DataOut-In Stream : 자바의 데이터 P/R 타입을 원형 그대로 스트림에 쓰는 API
 * 
 * 이 스트림은 자바데이터  타입의 원형 그대로를 쓰기 때문에, 값과 상관없이 사용된 데이터 타입의 크기만큼 쓰여짐
 * ( ex : writeInt(1) ---> 4byte 씀)
 * 
 *  이렇게 쓰여진 데이터를 Input 으로 가져올때는 반드시 쓴 순서 그대로 read() 해야함.
 *  
 *  안그럼 bit가 깨짐  ex : writeInt(), boolean(), string() --> readInt(), boolean() ... 식으로
 * 
 */
public class DataOutInExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum = 0;
		int a=0;
		long b=0;
		
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
			///일부로 틀리게 읽음 발생.
//			System.out.println(dis.readLong());
//			System.out.println(dis.readInt());
			boolean c;
			
			a = dis.readInt();
			b = dis.readLong();
			c = dis.readBoolean();
			
//			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
//			dos.writeInt(1);
//			dos.writeLong(0);
//			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			sum = a + b;
			System.out.println(sum);
			
		}
	}

}
