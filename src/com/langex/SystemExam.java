package com.langex;

import java.util.Enumeration;
import java.util.Properties;

public class SystemExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		//운영체제의 정보를 get 해보도록 합니다.
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		Properties properties =  System.getProperties();
		Enumeration enu = properties.propertyNames();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			String key = (String)enu.nextElement();
			String value = properties.getProperty(key);
			System.out.printf("%-40s: %s/n",key,value);
		}
		
	}

}
