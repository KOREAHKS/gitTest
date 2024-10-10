package com.langex.lambda;

class MyButton{
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton myBtn = new MyButton();
		myBtn.setClickListener(()->{
			System.out.println("OK 버튼을 누름");
		});
		myBtn.click();
		
		MyButton cancel = new MyButton();
		cancel.setClickListener(()->{
			System.out.println("캔슬버튼 누름");
		});
		cancel.click();
	}

}
