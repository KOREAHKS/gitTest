package com.lang.thredex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * thread safe Collection 얻기 및 사용하기
 * 
 * Thread safe collection 은 하나 이상의 쓰래드가 접근할때 내부적으로 모든 메서드가 동기화 적용된 collection 을 뜻함
 * 
 * 이 객체들은 Collections 클래스의 synchronized... () 를 통해서 얻어내고, 얻어낸 객체는 add, get 할 때 자동으로 동기화가 적용됨
 * 
 * 아래는 이 예시를 확인하는 예임.
 */
public class SynchColletctionEx {

	public static void main(String[] args) {
		
		//동기화된 Map 객체 얻어내기
		//Map<Integer, String> map = Collections.synchronizedMap(new HashMap<Integer, String>());
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i<1000; i++) {
					map.put(i, "내용"+i);
				}
			};
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i<2000; i++) {
					map.put(i, "내용"+i);
				}
			};
		};
		t2.start();
		
		//main 은 위 두 쓰래드가 작업종료시까지 일시정지로 이동..
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int size = map.size();
		System.out.println("추가된 총 요소(element) 수 : " + size);
	}

}
