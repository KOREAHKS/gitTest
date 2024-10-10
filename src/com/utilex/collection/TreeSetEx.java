package com.utilex.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		
		for(Integer s : ts) {
			System.out.println(s);
		}
		
		System.out.println(ts.first()); // 제일 낮은 수
		System.out.println(ts.last());  // 제일 높은 수
		System.out.println("특정 범위 아래 : " + ts.lower(5));  //5보다 바로 아래 수
		System.out.println("특정 범위 위 : " + ts.higher(3));  //3보다 바로 위 수
		
		NavigableSet<Integer> nvSet = ts.descendingSet();
		for(Integer s : nvSet) {
			System.out.println(s);
		}
		
		System.out.println("=====================");
		//특정 범위 검색
		nvSet = ts.subSet(2, true, 4, false);
		for(Integer s : nvSet) {
			System.out.println(s);
		}
	}

}
