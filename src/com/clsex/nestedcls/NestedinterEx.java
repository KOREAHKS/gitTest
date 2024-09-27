package com.clsex.nestedcls;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.clsex.nestedcls.MyButton.MyClickListener;

/*
 *  중첩 인터페이스 : 클래스내부에 멤버로 참여하도록 선언된 인터페이스를 말함.
 *  주로 설계되는 목적은 외부 클래스의 특정 기능을 구현토록 정의한다.
 *  하나의 예로, 안드로이드에서 사용되는 컴포넌트중의 버튼 같은 경우, UI를 구현한 클래스와
 *  이 UI 에 발생되는 이벤트를 처리하도록 내부적으로 인터페이스를 적용해서,
 *  버튼의 이벤트 핸들러를 이 내부 인터페이스가 담당하도록 설계한 예이다.
 *  
 *   이렇게 되면, 특정 버튼이 수행 해야할 이벤트 핸들러를 따로 정의 할 필요없이 버튼에 할당 된 메서드를 통해내부 인터페이스의 구현 객체가 
 *   그 핸들러 역할을 수행 할 수 있어서 편리한 장점이 생긴다.
 *   
 *   내부 인터페이스는,
 *   외부 클래스의 멤버로만 존재할때는 private 으로 선언하거나, 외부에 노출을 시킬때는 public, default 로 선언가능하다.
 *   static 또한 인터페이스 목적에 따라서 선언 할 수 있다.
 *   
 *   [public|private][static] interface InterfaceName{......}
 *   인터페이스 내부에는 일반 인터페이스처럼 상수, 추상메서드, 디폴드 메서드, 정적 메서드 모두 선언 가능하다. 
 */

class MyFrame extends Frame{
	
	Button button;
	
	public MyFrame() {
		super("이건 자바 프레임");
		init();
	}
	
	void init() {
		button = new Button("이건 버튼임");
		this.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(button, "프로그램을 종료함");
				System.exit(0);
			}
		});
		this.setSize(300,300);
		this.setLocation(300, 300);
		this.setVisible(true);
	}
}
//내가 Button 클래스를 만든다고 가정하고 정의해 볼게요.

class MyButton{
	
	private MyClickListener myClickListener;
	
	//이 버튼에 이벤트가 발생하면 리스너가 알 수 있도록 리스너 setter 정의
	public void setMyClickListener(MyClickListener myclickLitener) {
		this.myClickListener = myclickLitener;
	}
	
	public void click() {
		this.myClickListener.onClick(); // 버튼에 클릭이 발생하면 핸들러로 inner inter 의 클릭을 호출함
	}
	
	//버튼에 이벤트가 오면, 이벤트를 핸들링 할 수 있도록 Listener 을 내부에 정의 합니다.
	//자바에서는 모든 Listener 은 인터페이스 타입입니다.
	public static interface MyClickListener{
		void onClick();
		
		
	}
}


public class NestedinterEx {

	public static void main(String[] args) {
		MyButton okButton = new MyButton();
		//지역 클래스로 클릭리스너의 구현 클래스로 정의함
		class OkListener implements MyButton.MyClickListener{
			
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 눌렀군요");
			}
		}
		okButton.setMyClickListener(new OkListener());
		okButton.click();
		
		MyButton cancelBtn = new MyButton();
		class CancelListener implements MyButton.MyClickListener{
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했군요");
				
			}
		}
		cancelBtn.setMyClickListener(new CancelListener());
		cancelBtn.click();
		
		//new MyFrame();
	}
}
