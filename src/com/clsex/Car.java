package com.clsex;

public class Car {
	
	private String color;
	private String brand;
	private String model;
	private int speed;
	private boolean isStart;

	public Car(String color, String brand, String model, int speed, boolean isStart) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.isStart = isStart;
		
		powerOff();
	}
	
	private void powerOff() {
		if(isStart != true) {
		System.out.println(this.model + "의 모든 전원이 종료됨.");
		}
	}
	//계기판의 속도 표시 메서드 정의
	public int displaySpeed() {
		return speed;
	}
	public void engineStart() {
		System.out.println("차량의 시동이 잘 걸렸습니다.");
		isStart = true;
		this.speed = 0;
	}
	public void accel(int speed) throws InterruptedException {
		System.out.println(speed + "만큼 가속합니다.");
		for(int i = this.speed; i<speed; i++) {
			Thread.sleep(500);
			System.out.println("+"+i);
		}
		this.speed += speed;
		System.out.println("현재 속도는 " + this.speed);
	}
	
	public void enginStop() {
		if(isStart) {
			if(speed > 0) {
				speed = 0;
				isStart = false;
				System.out.println("엔진이 종료되었습니다.");
			}
		}else {
			System.out.println("현재 엔진이 가동중이 아님..");
		}
	}
	
}
