package com.langex.lambda.stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File 객체를 이용해서 스트림을 연결, 데이터를 read 했지만
		// 이번에 nio 패키지에 보면 Path 객체란 놈이 있음.
		// 이 놈을 이용해서 InputStream 을 연결해 보겠음.
		try {
			Path path = Paths.get(NIOStreamEx.class.getResource("data.txt").toURI());
			Stream<String> stream =  Files.lines(path);
			stream.forEach(prod -> System.out.println(prod));
			stream.close();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
