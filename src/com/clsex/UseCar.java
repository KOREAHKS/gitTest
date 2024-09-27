package com.clsex;

public class UseCar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Car genesis = new Car("black", "현대", "GV60", 0, false);
		Car myCar = new Car("white", "porche", "911", 0, false);
		
		myCar.engineStart();
		myCar.accel(10);
		myCar.enginStop();
		
	}

}
