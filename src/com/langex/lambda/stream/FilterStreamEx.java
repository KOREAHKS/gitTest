package com.langex.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
 *  distinct() : 객체인 경우 Hash 비교 후 같으면 제거함, 나머지 p type 은 값이 같은 경우 제거
 *  filter() : Predicate 타입의 함수 객체를 이용해서, filter 할 조건을 정의하면, 해당 조건에 맞게 filtering 후 stream 리턴함
 *  
 */
public class FilterStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("AB");
		list.add("AAA");
		list.add("BC");
		list.add("A");
		
		//distinct()
		list.stream()
			.distinct()
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		//특정 조건을 부여한 predicate 함수를 적용한 filter 작업
		list.stream()
			.filter(t -> t.startsWith("A"))
			.forEach(t -> System.out.println(t));
		
		
		//변환 method 인 map....() 를 이용해서 변환시키기
		//이 map 은 주어진 A -> C 로(타입을 준 경우에..) 변환해서, 변환된 요소를 갖는 스트림을 리턴함.
		
		List<Player> list2 = new ArrayList<Player>();
		list2.add(new Player("재현", 100));
		list2.add(new Player("주영", 90));
		list2.add(new Player("경수", 80));
		list2.add(new Player("우석", 70));
		
		//Player 를 score로 변환 하도록 함
		list2.stream()
			.mapToInt(player -> player.getScore())
			.forEach(inValue -> System.out.println("플레이어의 score " + inValue));
		
		int[] intArr = {1,2,3,4,5};
		//위 int 배열을 스트림을 이용해서 double 로 변환 후 출력해보세요.
		Arrays.stream(intArr)
			.asDoubleStream()
			.forEach(dVal -> System.out.println(dVal));
		
		Arrays.stream(intArr)
			.boxed()
			.forEach(t -> t.intValue());
		
		//요소를 정렬하는 스트림
		//대표적인 메서드로는 sorted() 등이 있음.. sortXXX() 는 모두 정렬 기반 스트림을 리턴하는 메서드임
		//만약 정렬의 대상인 객체들은 모두 Comparable 을 구현한 객체 이어야 함.
		//안그럼 예외가 발생함
		
		list2.stream()
			.sorted()
			.forEach(t -> System.out.println("점수는 " + t.getScore()));
		
		list2.stream()
			.sorted((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()))
			.forEach(t -> System.out.println(t.getName() + " : " + t.getScore()));
		
		
		//filter 에 조건을 더한 요소의 개별 처리 방법 알아보기.
		
		System.out.println(Arrays.toString(intArr));
		
		Arrays.stream(intArr)
			.filter(value -> value % 2 == 0)
			.peek(res -> System.out.println(res))
			.sum();
		//peek() 은 중간처리 요소임.. 따라서 최종처리해야 하는 최종 처리 요소가 다시 나와야 실행됨
		//반면에 forEach 는 최종처리 요소임..
		
		
		//match() 관련 처리 방법 알아봅니다.
		boolean isAllEven = Arrays.stream(intArr)
			.allMatch(value -> value % 2 == 0);
		System.out.println("배열의 값은 모두 짝수임 ?? " + isAllEven); // allMatch > 모두 맞으면 true 
		
		boolean isAllEven2 = Arrays.stream(intArr)
				.anyMatch(value -> value % 2 == 0);
			System.out.println("배열의 값은 모두 짝수임 ?? " + isAllEven2); // anyMatch > 하나라도 맞으면 true
		
			
			
		// 최종 요소 함수.. 즉 peek() 처럼 중간 처리 함수가 아닌, 최종 결과를 리턴하는 함수를 뜻함.
		// 이 최종 함수는 대부분 집계함수(합, 평균 등...) 로 구성되어있음..
		/*
		 *  종류로는 다음과 같음 : count , findFirst , maxCompartion , max , min , average , sum 등..
		 *  위 함수들은 대부분 스트림 내부의 데이터를 내부적으로 연산처리한 결과를 담은 Optional 함수등과 같다고 볼 수 있음.
		 */
			
		long cnt = Arrays.stream(intArr)
			.filter(n -> n % 2 == 0)
			.count();
		System.out.println("배열내의 짝수 수 : " + cnt);
			
		
		cnt = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.max()
				.getAsInt();
		System.out.println("배열내의 짝수 중 가장 큰 수 : " + cnt);
			
		//Optional 클래스 : 컬렉션의 요소를 stream 을 통해 get 했을때,	이 타입객체로 리턴하는 메서드가 있음
		//그럼 이 클래스의 여러 메서드를 이용해서, 요소가 존재 하는지의 여부와, 집계된 결과에 따른 조건을 사용한다던지
		//등의 작업을 수행할 수 있는 클래스임
		//대표적인 메서드로는 isPresent() 가 있음.. 요소가 존재하는지의 여부를 리턴함.
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//아래는 요소가 비워진 상태에서 연산이 이뤄지므로 예외가 발생함.
//		double avg = al.stream()
//			.mapToInt(Integer::valueOf)
//			.average()
//			.getAsDouble();
			
		
		//위 처럼 처리된 스트림의 최종 함수를 이용할때는 요소의 존재 여부가 매우 중요함
		//이때 이를 처리하는 클래스가 Optional 임.
		
		OptionalDouble optional =  al.stream()
			.mapToInt(Integer::valueOf)
			.average();
		if(optional.isPresent()) {
			System.out.println("요소의 최종 작업 : " + optional.getAsDouble());
		}else {
			System.out.println("처리할 요소가 없음.");
		}
		
		//if else 처럼 요소가 있고 없고에 따른 기본값 처리도 할 수 있음
		double avg = al.stream()
					.mapToInt(Integer::intValue)
					.average()
					.orElse(0.0); // default 값 설정
		System.out.println("avg ----> " + avg);
		
		
		//요소 수집 : 스트림을 통해 처리된 요소를 최종 집계 하는 대표적인 메서드가 collect() 임..
		//이 메서드를 이용해서 수집된 요소중 필요한 부분만을 담을 수 있고, 이를 그룹화 한 후 최종 요소처리함수를
		//이용해서 집계등에도 활용 할 수 있음.
		
			
			
			
			
		
			
			
			
	}

}
