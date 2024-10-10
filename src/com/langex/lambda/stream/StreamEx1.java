package com.langex.lambda.stream;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

/*
 * java.util.stream : 내부 반복자(순환자)를 적용한 컬렉션의 요소 처리 패키지
 * 
 * 중간처리 스트림, 최종 스트림 : 스트림은 연속적으로 메서드를 이용해서, 확장 가능함.
 * 이때 중간에 추가되는 스트림 종류는 매퍼, 변환 등...여러 스트림이 존재하는데, 이 스트림을 이용하면 
 * 오리진스트림으로 부터의 데이터를 변환 등을 거쳐 다른 스트림으로 보내게 됨.
 * 이 추가된 스트림으로부터 데이터를 받아서 최종 처리하는 스트림을 이용해서 원하는 데이터를 완성시킬 수 있음
 * 단, 주의해야할점은 중간 스트림을 생성해서 얻어내 스트림을 이용하는 최종 스트림이 생략되면,
 * 스트림 전체가 처리가 안되는 상태에 빠짐.. 때문에 중간 변환 스트림을 이용하면, 최종 스트림을 반드시 처리해야함.
 */

@AllArgsConstructor
@Data
class Player implements Comparable<Player>{
	private String name;
	private int score; // 최종 승률 정도로 생각하세요.
	
	@Override
	public int compareTo(Player player) {
		// TODO Auto-generated method stub
//		if(this.score < player.getScore()) return -1;
//		else if(this.score == player.getScore()) return 0;
//		else return 1;
		return Integer.compare(score, player.score);
		
	}
	
	
	
}

public class StreamEx1 {
	static int sum = 0;
	public static void main(String[] args) {
		//List 를 새성해서 각 요소에 3명의 Player 를 add 시킴
		List<Player> players = Arrays.asList(new Player("재현", 85),new Player("재형", 75),new Player("주영", 99));
		
		Stream<Player> pStream = players.parallelStream();
		//player 의 랭크를 기준으로 하는 score 를 얻어내서 int 스트림으로 확장함
		IntStream inStr = pStream.mapToInt(player -> player.getScore());
		double avg = inStr.asLongStream().average().getAsDouble();
		
		System.out.println("세 사람의 평균 점수 : " + avg);
		
		double avg2 = players.stream()
				.mapToInt(value -> value.getScore())
				.average()
				.getAsDouble();
		
		//IntStream 의 range() 를 이용해서 범위 만큼의 int 를 스트림으로부터 get 해보자
		
		
		IntStream.rangeClosed(0, 100) //100 미만..
		.forEach(value -> {
			sum += value;
		}
		);
		System.out.println("누적합 : " + sum);
		
		
		// TODO Auto-generated method stub
//		Set<String> set = new HashSet<String>();
//		
//		set.add("a");
//		set.add("b");
//		set.add("c");
//		
//		Stream<String> stream = set.stream();
//		stream.forEach(t -> System.out.println(t));
//	
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		System.out.println(list);
//		
//		Stream<Integer> st = list.stream();
//		st.forEach(value -> System.out.println("-----> " + value));
		
		//사용자 객체 정렬해보기
		
		
		
		
		
		
	}

}
