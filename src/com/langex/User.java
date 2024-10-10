package com.langex;
//DTO 사용할 User 클래스

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//롬복 어노테이션 사용함

@NoArgsConstructor//기본생성자 자동 생성
@AllArgsConstructor//필드생성자 자동 생성
@Data//getter / setter / toString 자동 생성
//getter , setter 도 있지만 대부분 Data 어노테이션 이용함
//@RequiredArgsConstructor 이 생성자는 기본적으로는 파라미터가 없는 생성자를 포함하지만
//final 로 선언된 필드를 초기화 할 때 사용함 / 나중에 web 작업할때 많이 사용

public class User {
	private String id;
	private String pw;
	private String name;
	private Date reg_date;
	

}
