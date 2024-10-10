package com.clsex;

public class Marine {
	
	private int blood;
	UnitBloodinfo info; // 내 클래스에서 외부 클래스를 갖다 씀
	
	public void attacked(int damage) {
		this.blood -= (int)(Math.random() * 10);
		
		if(this.blood == 0) {
			System.out.println("마린이 죽었습니다.");
		}
		
	}
	public void getHeal(int blood) {
		if(this.blood > UnitBloodinfo.MARIN_MAX) return;
		this.blood += blood;
	}
	
	//가변형 파라미터 : 같은 타입의 값을 하나 이상, 갯수제한 없이(배열포함) 전달 할 수 있는 기능..
	public void doSome2(int ...args) {  // args 는 지역변수이므로 변수변 변경 가능
		//args 는 내부적으로 int[] 로 자동 변환되고, 넘겨지는 파라미터의 값을 자동으로 배열값으로 넣어서 처리해버림.
		for(int x : args) {
			System.out.println(x);
		}
	}
	public void doSome(int a) { //int 타입의 값 하나만 받을 수 있음.
		
	}
	
	public static void main(String[] args) {
		Marine m = new Marine();
		m.doSome2(1,2,3,4);
		m.doSome2(new int[] {100,200,300,400,500});
	}
	
}
