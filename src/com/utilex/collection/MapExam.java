package com.utilex.collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 타입 : Key=Value 로 객체를 저장함. 키가 중복되면 Value 를 덮어쓰는 특징을 가지고 있음.
 * 대표적인 구현체(구현클래스)로는 HashMap, HashTable 이 있으며, 쓰래드와 연관성이 없는 경우엔 HashMap 을, 그렇지 않은 경우엔
 * Table 을 사용함.(나중에 강의 예정)
 * 
 * 
 */
public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("재현", 90);
		map.put("주영", 95);
		map.put("아영", 96);
		map.put("지훈", 97);
		map.put("재현", 100);
		
		System.out.println("저장된 객체(entry) 수 : " + map.size());
		System.out.println(map.get("재현"));
		
		
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer v = map.get(key);
			System.out.println("key " + key + "= value " + v);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet){
			System.out.println("경수작업 : " + entry.getKey() + " : " + entry.getValue());
		}
		
		Set<Entry<String, Integer>> set= map.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("쌤 작업 : " + key + " : " + value);
		}
		
	}

}
