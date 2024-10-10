package com.langex.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Stream 의 collect(Collector(T,A,R)) : Collector 를 이용해서, T 요소를 A 누적기를 통해(함수형태), R 요소에 넣어두는 작업을 하는 메서드
 * 실제 변환 작업은 Collector 객체가 하는데, 얘는 Collectors 클래스를 이용해서 얻어낼 수 있음.
 * 
 * 위 collect()를 이용하면, 특정 타입의 컬렉션을 다른 타입으로 변경해서 리턴할 수 있음.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
class CollectUser{
	private String name;
	private String gender;
	private int score;
	
}
public class UseCollectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CollectUser> userList = new ArrayList<CollectUser>();
		userList.add(new CollectUser("재현", "남성", 30));
		userList.add(new CollectUser("지윤", "여성", 100));
		userList.add(new CollectUser("만식", "남성", 95));
		userList.add(new CollectUser("세리", "여성", 96));
		
		//성별이 남성인 유저만 추출해서 List 로 만듭니다.
		List<CollectUser> maleList = userList.stream()
				.filter(user -> user.getGender().equals("남성"))
				.toList();
		maleList.forEach(user -> System.out.println(user.getGender()));
		
		System.out.println("===========================================");
		
		//유저 이름을 key, 점수를 value 로 갖는 Map 으로 요소를 변형해봅니다.
		
		Map<String, Integer> map = userList.stream()
			.collect(Collectors.toMap(t -> t.getName(), t -> t.getScore()));
		
		System.out.println(map);
	}

}
