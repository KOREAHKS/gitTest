package com.utilex.collection;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import lombok.Value;

/*
 *  Properties 객체 : properties 로 저장된 파일에 key=value 로 정보를 저장하고
 *  특정 클래스가 이 정보가 필요할때, 객체를 생성 후 정보를 활용할 때 주로 사용한다.
 *  이 파일을 읽을때는 일반적으로 InputStream 객체가 연결되어야 하는데, load() 에서
 *  스트림을 연결함..
 *  연결된 이후에는 getter 를 통해 key 에 해당하는 정보를 얻어내면 끝.
 */
public class ProperExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		//프로퍼티스 파일 로드... 같은 경로에 있을때는 class.get...()을 이용해서 얻어낼 수 있음.
		prop.load(ProperExam.class.getResourceAsStream("db.properties"));
		
		//Iterator 의 이전버전인 내부순환객체인 Enumeration 을 이용해서 각 키를 얻어내볼게요.
		Enumeration enumer = prop.keys();  //key만 Enumeration으로 변환
		while(enumer.hasMoreElements()) {
			//System.out.println(enumer.nextElement());
			String key = (String)enumer.nextElement();
			String value = prop.getProperty(key); //key 해당하는 value를 리턴
			
			System.out.println(key + "=" + value);
		}
	}

}
