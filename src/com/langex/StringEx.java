package com.langex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/*
 * 자바 표준 모듈 : 모듈 내부에 패키지를 두고, 이를 JDK 인스톨시 자동으로 JAVA SE 의 필수 API를 배치하여, 이를 개발자가 사용하도록 함
 * 
 *  이중 java.lang 패키지는 import 하지 않아도 자동 import 되는 유일한 패키지로, 하위에는 많은 기본 핵심 class, interface 등이 존재한다.
 *  
 *  java.lang 패키지의 API부터 공부시작함.
 */
public class StringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String str = "hi";
		String str2 = "hi";
		System.out.println(str == str2);
		
		String str3 = new String("hi");//생성자를 이용한 문자열 객체는 무조건 heap 생성함
		System.out.println(str3 == str);
		
		/*
		 *  문자열객체는 기본적으로 조작이 가해지면 새로운 instance 를 생성 후 리턴함.
		 *  만약 조작이 많이 가해지는 경우엔 쓸데없는 instance 가 생겼다가 사라짐.
		 *  이를 기능적으로 커버한게 StringBuilder 클래스임.
		 *  얘는 내부적으로 문자열 객체를 일종의 관리 메모리(Buffer 메모리)에 넣고, 그 내부에서 조작을 하도록 정의되어짐.
		 *  결론, 만약 문자열에 조작을 많이 가한다 그럼 StringBuilder 을, 그렇지 않은 경우엔 String 을 사용하면 됨  
		 */
		
		String data = "자바";
		//위의 값을 byte로 쪼개볼게요.
		byte[] arr1 = data.getBytes();
		System.out.println("arr1" + Arrays.toString(arr1));
		
		String str4 = new String(arr1,1,arr1.length-1);
		System.out.println(str4);
		
		byte[] arr2 = data.getBytes("EUC-KR"); //EUC-KR로 인코딩
		System.out.println(Arrays.toString(arr2));
		
		String str5 = new String(arr2,"UTF-16");
		System.out.println(str5);
		
		//Charset 객체를 이용한 문자셋 별칭 출력해보기
		Charset chset = Charset.defaultCharset();
		Set set = chset.aliases();
		System.out.println(set);
		
		Map charMap = Charset.availableCharsets();
		for(int i = 0; i<charMap.size(); i++) {
			System.out.println(charMap);
		}
		
		StringBuilder sb = new StringBuilder("스트링빌더");
		String sbString = new String(sb);
		sbString = sbString + "하하하";
		
		String lolem = "dkgajdsljalsdkjtalksjtaslkdjtalsjt";
		for(int i = 0; i<lolem.length(); i++) {
			char ch = lolem.charAt(i);
		}
		
		String name = "가나다";
		for(int i = 0; i<name.length(); i++) {
			System.out.println(name.codePointAt(i));
		}
		
		String a = "b";
		String aa= "a";
		
		System.out.println(a.compareTo(aa));
		
		a = a.concat("bc");
		System.out.println(a);
		
		
		System.out.println(a.contains("b"));
		
		String chString = String.copyValueOf(new char[]{'a','b'});
		
		System.out.println(chString);
		
		System.out.println("a".equalsIgnoreCase("A"));
		
		String res = String.join(",","123","abc","가나다");
		System.out.println(res);
		
		System.out.println("a".repeat(4));
		
		
		
		
		
		
		
		
	}

}
