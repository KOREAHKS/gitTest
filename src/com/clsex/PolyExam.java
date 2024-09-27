package com.clsex;

class A extends Object{     //extends Object가 숨어져있음
	A(){
		super();
	}
}
class B{
	
}
class C{
	
}
public class PolyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		short s = 2;
		char ch = 3;
		
		int[] arr = {b,s,ch}; //Promotion (작은 타입이 큰 타입으로 들어갈 경우)
		
		b = (byte)arr[0];
		
		A aa = new A();
		B bb = new B();
		C cc = new C();
		System.out.println(aa);
		System.out.println(bb);
		
		Object objArr[] = {aa,bb,cc};
		
		aa = (A)objArr[0];
		
		Object obj = aa;
		obj = new A();
		
	}

}
