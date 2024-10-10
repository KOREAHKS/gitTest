package com.utilex.collection;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeMap 의 정렬기준은 key를 기준으로 함
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
	tm.put("dvd", 90);
	tm.put("aka", 35);
	tm.put("kgb", 57);
	tm.put("absolue", 86);
	tm.put("cass", 97);
	tm.put("hite", 85);
	tm.put("soju", 56);
	
	Set<Entry<String, Integer>> entSet = tm.entrySet();
	for(Entry<String, Integer> entry : entSet) {
		System.out.println(entry.getKey() + " - " + entry.getValue());
	}
	
	System.out.println("================");
	
	//entSet = null;
	
	Entry<String, Integer> entry = tm.firstEntry();
	System.out.println(entry.getKey() + entry.getValue());
	
	}

}
