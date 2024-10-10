package com.lang.thredex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 쓰래드 Pooling : 프로그래머가 쓰래드를 잘못 설계해서 생성하게 되면, 제어불가능 할 정도로 많은 쓰래드가 생성되고,
 * 소멸되지 못한 상태에서 리소스만 차지할 수 있음. 이를 위해서 쓰래드풀 이라는 개념이 등장함(꽤 오래전부터임..)
 * 이 쓰래드 풀은 원래 오픈 라이브러리로 제공이 되어서 사용했는데, 자바에선 최근 이 개념을 공식 api 로 등록해서 
 * 사용하도록 함.
 * 
 * 이를 쓰래드 풀 이라고 함.
 * 
 * 특징 : 한 번에 생성할 쓰래드의 갯수를 지정하고, 특정 시간동안 활동하지 않는 쓰래드는 소멸시키며,최소 몇개의 쓰래드는
 * 항상 남겨두는지의 여부를 결정할 수 있음.
 * 
 * 이렇게 쓰래드풀을 생성하면, 쓰래드의 생성 및 주기 관리는 VM 이 알아서 하도록 하게되므로, 개발자는 로직에만 집중할 수 있도록 함.
 * 
 */
public class ThreadPoolExam {

	public static void main(String[] args) {
		//1000개의 메일설정..
		String[][] mails = new String[100][3];
		
		for(int i = 0; i<mails.length; i++) {
			mails[i][0] = "test@test.com";
			mails[i][1] = "poolTest" + i + "@user.com";
			mails[i][2] = "이런저런 메일의 내용";
		}

		long startTime = System.currentTimeMillis(); // 쓰래드 새 생성 및 수행 시작
		ExecutorService executorService = Executors.newFixedThreadPool(10);
	
		//위에 생성한 각 메일을 전송하는 작업 정의 및 쓰래드 수행..
		for(int i = 0; i<1000; i++) {
			final int idx = 1;
			
			//쓰래드 수행..
			executorService.execute(new Runnable(){
				
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					
					System.out.println(thread.getName() + " : from : " + " ===> to" + content);
				}
			});
		}
	
		executorService.shutdown();
		long enTime= System.currentTimeMillis(); // 쓰래드 수행 종료
		
		System.out.println(enTime - startTime);
	}

}
