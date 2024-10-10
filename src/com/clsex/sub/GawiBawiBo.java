package com.clsex.sub;

import java.util.Scanner;

public class GawiBawiBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  가위바위보 게임 : 이 클래스에서 시작을 하고, 최소한 3개 잇아의 클래스를 정의해서 완성되도록 하세요.
		 *  
		 *  게임룰은 게임시작 출력 후 , ID(Email) 입력 하라고 받고, 본인 Email과 password이 아니면 게임을 종료 시키세요 (ID가 틀림 메시지와)
		 *  만약 인증이 되면, 기존 룰 대로 입력을 받고(가위,바위,보) 랜덤한 컴과 승부 후 결과를 출력 시키세요. (ex> 컴:가위 , 너 : 보 컴 승리)
		 *  이후 계속 할건지에 대한 질문을 출력하고 y/n으로 결정하세요.
		 *  게임이 끝나면, 총 전적과 승률 등을 출력 시키고 게임을 종료시키세요.
		 */
		
		Info email=null, pass=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일과 패스워드를 입력하세요.");
		System.out.print("이메일 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pa = sc.next();
		System.out.println("당신의 이메일은 " + id + " 패스워드는 " + pa +" 입니다.");
	
		boolean game = true;
		
		int totalGame = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
<<<<<<< HEAD
		System.out.println("게임을 시작합니다.");
		while(game) {
		int com = (int)(Math.random() * 3); 
		if(id.equals("a") && pa.equals("b")) {
			System.out.println("가위(0) 바위(1) 보(2) 중 하나 입력하세요..");
			int yoursel = Integer.parseInt(sc.next());
			System.out.println("유저 : " + yoursel + " 컴퓨터 : " + com);
			if(yoursel <= 2) {
				if(yoursel == com) {
					System.out.println("비겼습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					draw++;
				}else if(yoursel <= com) {
					System.out.println("졌습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					lose++;
				}else if(yoursel >= com) {
					System.out.println("이겼습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					win++;
				}System.out.println("게임을 계속 하시려면 y를 종료하시려면 n을 입력하세요.");
			}else {
				System.out.println("잘못된 값입니다. 다시 입력하세요");
			}String yourtext = sc.next();
			if(yourtext.equals("y")) {
				System.out.println("게임이 다시 시작 됩니다.");
			}else if(yourtext.equals("n")) {
				System.out.printf("총 게임 수 : %d 승리 : %d 패배 : %d 무승부 : %d\n", totalGame, win, lose, draw);
				break;
			}
		}else {
			System.out.println("잘못되었습니다. 게임이 종료됩니다.");
			game = false;
		}
	}
		
	}
}
=======
		//System.out.printf("총 게임 수 : %d 승률 : %.2f %",totalGame, rating);
		System.out.println("게임을 시작합니다.");
		while(game) {
		int com = (int)(Math.random() * 3); 
		if(id.equals("a") && pa.equals("b")) {
			System.out.println("가위(0) 바위(1) 보(2) 중 하나 입력하세요..");
			int yoursel = Integer.parseInt(sc.next());
			System.out.println("유저 : " + yoursel + " 컴퓨터 : " + com);
			if(yoursel <= 2) {
				if(yoursel == com) {
					System.out.println("비겼습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					draw++;
				}else if(yoursel <= com) {
					System.out.println("졌습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					lose++;
				}else if(yoursel >= com) {
					System.out.println("이겼습니다.");
					System.out.println("총 게임 수 : " + totalGame++);
					win++;
					System.out.println("게임을 계속 하시려면 y를 종료하시려면 n을 입력하세요.");
				}
			}else {
				System.out.println("잘못된 값입니다. 다시 입력하세요");
			}String yourtext = sc.next();
			if(yourtext == "y") {
				System.out.println("게임이 다시 시작 됩니다.");
			}else if(yourtext == "n") {
				System.out.println("총 게임 수 : " + totalGame + " 승리 : " + win + " 패 : " + lose + " 승률 : " + (win/totalGame)*100 + "%");
				break;
			}
		}else {
			System.out.println("잘못되었습니다. 게임이 종료됩니다.");
			game = false;
		}
	}
		
	}
}
>>>>>>> refs/remotes/origin/master
