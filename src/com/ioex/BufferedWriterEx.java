package com.ioex;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("D:\\ioRoot\\bwriter.txt");
			bw = new BufferedWriter(fw);
			
			String msg = "asdfaasdf";
			
			bw.write(msg);
			bw.newLine();
			bw.write("아 배불러");
			
			bw.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
