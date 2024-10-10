package com.langex.lambda.stream;

import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];
		
		int idx = 0;
		while(true) {
			int number = (int)(Math.random() * 45)+1;
			
			boolean insert = true;
			for(int i = 0; i<=idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break;
		}
		Arrays.sort(lotto);
		for(int i = 0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
