package com.langex;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random r = new Random();
//		Random seedR = new Random(System.currentTimeMillis());
//		
//		System.out.println(System.currentTimeMillis());
//		
//		System.out.println(seedR.nextInt());
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt(100));
//		
//		System.out.println(r.nextDouble(10));
//		
		
		//선택번호를 담는 배열 선언 해보세요.
		int[] selNumber = new int[6];
		Random random = new Random(3);
		
		for(int i = 0; i<6; i++) {
			selNumber[i] = random.nextInt(45) + 1;
			System.out.println(selNumber[i]);
		}
		System.out.println();
		
		
		//당첨번호
		int[] luckyNum = new int[selNumber.length];
		random = new Random(5);
		for(int i = 0; i<6; i++) {
			luckyNum[i] = random.nextInt(45) + 1;
			System.out.println(luckyNum[i]);
 		}
		System.out.println();
		
		//배열 정렬을 시킬게요
		Arrays.sort(selNumber);
		Arrays.sort(luckyNum);
		
		boolean res = Arrays.equals(selNumber, luckyNum);
		
		System.out.println("학원 나올지 말지 여부");
		if(res) {
			System.out.println("넌 부자");
		}else {
			System.out.println("열공 합시다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
